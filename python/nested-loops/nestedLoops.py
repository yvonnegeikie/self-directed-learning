#Nested Loops 
sales_data = [[12, 17, 22], [2, 10, 3], [5, 12, 13]]
scoops_sold = 0

for location in sales_data: # loop through the 3 inner lists in sales_data
  # print(location) 
  # [12, 17, 22]
  # [2, 10, 3]
  # [5, 12, 13]
  for num_scoops in location: # loops trough each number in the current list (inner list)
    scoops_sold += num_scoops # add up all of the numbers in the inner lists to get total scoops sold
    # print(scoops_sold)
    # 12
    # 29
    # 51
    # 53
    # 63
    # 66
    # 71
    # 83
    # 96
print(f"The total number of scoops sold across 3 locations was {scoops_sold}") 


  