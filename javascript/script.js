let raceNumber = Math.floor(Math.random() * 1000);
console.log(raceNumber);
let registeredEarly = false;
let runnerAge = 19;
if (runnerAge > 18 && registeredEarly) {
    raceNumber += 1000;
}
if (runnerAge > 18 && registeredEarly) {
    console.log(`Participant number ${raceNumber}, race starts at 9.30am.`);
}
else if (runnerAge > 18 && !registeredEarly) {
    console.log(`Participant number ${raceNumber}, race starts at 11am.`);
}
else if (runnerAge > 18) {
    console.log(`Participant number ${raceNumber}, race starts at 12.30pm.`)
}
else {
    console.log(`See the registration desk.`);
}