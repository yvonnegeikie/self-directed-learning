current_budget = 3500.75
shirt_expense = 9

def print_remaining_budget(budget): 
  print("Your remaining budget is: $" + str(budget)) # Your remaining budget is: $3500.75
print_remaining_budget(current_budget)
# This function is called print_remaining_budget
# It takes parameter 'budget' as input 
# The parameter 'budget' represents the amount of money 
# the value of current_budget is passed when print_remaining_budget is called 


def deduct_expense(budget, expense): 
  return budget - expense
# This function is named 'deduct_expense'
# It takes two parameters as input: 'budget' and 'expense'
# 'budget' represents the available amount of money
# 'expense' represents the amount of money being spent
# The function calculates the remaining budget after the expense has been deducted.
# It returns the updated budget value after the subtraction.

new_budget_after_shirt = deduct_expense(current_budget, shirt_expense)
print_remaining_budget(new_budget_after_shirt) 
# Your remaining budget is: $3491.75

