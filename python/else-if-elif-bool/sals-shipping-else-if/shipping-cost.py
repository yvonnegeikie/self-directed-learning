weight = 41.5

# ground shipping 
if weight <= 2:
  cost_ground = weight * 1.5 + 20
elif weight > 2 and weight <= 6:
  cost_ground = weight * 3.0 + 20
elif weight > 6 and weight <= 10:
  cost_ground = weight * 4.0 + 20
else:
  cost_ground = weight * 4.74 + 20
print("Ground shipping $",cost_ground)

# premium ground shipping 
premium_ground_shipping = 125.00
print("Ground Shiping Premium $", premium_ground_shipping)

# drone shipping 
if weight <= 2:
  cost_drone = weight * 4.50
elif weight > 2 and weight <= 6:
  cost_drone = weight * 9.0
elif weight > 6 and weight <= 10:
  cost_drone = weight * 12.0
else:
  cost_drone = weight * 14.25
print("Drone shipping $",cost_drone)

'''
Cheapest method of shipping a 4.8 pound package and how much would it cost? Ground shipping @ $34.4

Cheapest method of shipping a 41.5 pound package and how much would it cost? Ground Shiping Premium @ $125.0
'''




















