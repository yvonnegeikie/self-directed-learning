let userName = "Jane";
userName ? console.log(`Hello, ${userName}!`) : console.log("Hello!");

const userQuestion = "Will I have agood day?";
userQuestion
    ? console.log(`Yes ${userName}, you will have a good day!`)
    : console.log("It is not known");

console.clear();

let randomNumber = Math.floor(Math.random() * 8);
console.log(randomNumber);
let eightBall = "";
if (randomNumber === 0) {
    console.log(eightBall);
}
switch (randomNumber) {
    case 1:
        console.log("It is decidedly so");
        break;
    case 2:
        console.log("Reply hazy try again");
        break;
    case 3:
        console.log("Cannot predict now");
        break;
    case 4:
        console.log("My sources say no");
        break;
    case 5:
        console.log("Outlook not so good");
        break;
    case 6:
        console.log("Signs point to yes");
        break;
    case 7:
        console.log("It is certain");
        break;


}
