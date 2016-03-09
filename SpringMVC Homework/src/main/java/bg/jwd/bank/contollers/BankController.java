package bg.jwd.bank.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bg.jwd.bank.dto.BankOperation;
import bg.jwd.bank.services.WebBank;

@Controller
public class BankController {

	@Autowired
	private WebBank webBank;

	@RequestMapping(value = "/bankAcc", method = RequestMethod.GET)
	public String getBankAccount() {
		return "BankOperation";
	}

	@RequestMapping(value = "/bankOp", method = RequestMethod.POST)
	public String bankOperation(Model model, @ModelAttribute("bankOp") BankOperation bankOperations) {
		Double currentAmount;

		if ("D".equals(bankOperations.getOperations())) {
			currentAmount = webBank.deposit(bankOperations.getClient(), bankOperations.getAmount(),
					bankOperations.getCurrency());
		} else {
			currentAmount = webBank.withDraw(bankOperations.getClient(), bankOperations.getAmount(),
					bankOperations.getCurrency());
		}

		model.addAttribute("currentAmount", currentAmount);

		return "BankOperation";
	}

}
