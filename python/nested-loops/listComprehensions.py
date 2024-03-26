# TODO 
# We have defined a list heights of visitors to a theme park. In order to ride the Topsy Turvy Tumbletron roller coaster, you need to be above 161 centimeters.

# Using a list comprehension, create a new list called can_ride_coaster that has every element from heights that is greater than 161.

# Print can_ride_coaster.

# list comprehension style 
heights = [161, 164, 156, 144, 158, 170, 163, 163, 157]
can_ride_coaster = [height for height in heights if height > 161]
print(can_ride_coaster)

# Use a loop to print the same information as above
# can_ride_coaster = []
# for height in heights: 
#     if height > 161:
#         can_ride_coaster.append(height)
# print(can_ride_coaster) # 164, 170, 163, 163
