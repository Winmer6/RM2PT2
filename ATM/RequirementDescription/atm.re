As a customer, I want to withdraw money 
{
Basic Flow {
	(User) 1. the customer shall put card into ATM.
	(System) 2. When a card is put in, the ATM shall indentify whether it belongs to this bank and show a customer to enter password.
	(User) 3. the customer shall enter password.
	(System) 4. When password is entered, the ATM shall indentify whether it is right.
	(System) 5. If password is not valid, the ATM shall return error information.
	(System) 6. When password is valid, the ATM shall show amount of money left in card.
	(User) 7. the user shall choose to withdraw moner and enter amount of money to withdraw.
	(System) 8. When amount of money to withdraw is entered, the ATM shall see whether there is enough money in card.
	(System) 9. If number entered is more than money in card, the ATM shall return error information.
	(System) 10. When money in card is enough, the ATM shall show get money out.
	(User) 11. the customer shall get money and push get card button.
	(System) 12. When get card button is pushed, the ATM shall show get card out.
	(User) 13. the customer shall get card.
	(System) 12. When end of deal, the ATM shall show log all behavors and load to cloud.
	}
	
}
As a customer, I want to put money in
As a customer, I want to transfer money
As a customer, I want to change password