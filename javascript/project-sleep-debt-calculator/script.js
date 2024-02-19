// 1 & 2 & 3
/**
 * Find sleep hours for day of the week 
 * @param {string} day - day of the week
 * @returns {number} - number of hour of sleep 
 */
const getSleepHours = day => {
    if (day === 'monday') {
        return 8;
    } else if (day === 'tuesday') {
        return 8;
    } else if (day === 'wednesday') {
        return 8;
    } else if (day === 'thursday') {
        return 8;
    } else if (day === 'friday') {
        return 8;
    } else if (day === 'saturday') {
        return 8;
    } else if (day === 'sunday') {
        return 8;
    } else {
        return "No data!";
    }
};
// console.log(getSleepHours('monday'));

// Step 4 & 5
/**
 * calculate total hours of sleep per week 
 * @returns {number} - implicit return hrs of sleep per week 
 */
const getActualSleepHours = () => getSleepHours('monday') + getSleepHours('tuesday') + getSleepHours('wednesday') + getSleepHours('thursday') + getSleepHours('friday') + getSleepHours('saturday') + getSleepHours('sunday');
// console.log(getActualSleepHours()); // log 56 

// Step 6
/**
 * calculate ideal sleep hours per week 
 * @returns {number} - ideal sleep hrs per week 
 */
const getIdealSleepHours = () => {
    const idealHours = 9;
    return idealHours * 7;
}
// console.log(getIdealSleepHours()); // log 63 


// Spep 8 
const calculateSleepDebt = () => {
    const actualSleepHours = getActualSleepHours();
    const idealSleepHours = getIdealSleepHours();
};


// Step 9
if (actualSleepHours === idealSleepHours) {
    console.log("You got the perfect amount of sleep!");
} else if (actualSleepHours > idealSleepHours) {
    console.log("Your overslept!");
} else if (actualSleepHours < idealSleepHours) {
    console.log("You need more sleep, go back to bed!")
} else {
    console.log("No data");
}

//Step 10
if (actualSleepHours < idealSleepHours) {
    console.log('You got ' + (idealSleepHours - actualSleepHours) + ' hour(s) less sleep than you needed this week. Get some rest.');
}
//Step 11
calculateSleepDebt() 