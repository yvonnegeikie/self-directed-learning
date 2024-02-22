const getUserChoice = userInput => {
    userInput = userInput.toLowerCase();
    if (userInput === 'rock' || userInput === 'paper' || userInput === 'scissors') {
        return userInput;
    }
    else {
        console.log("Error!");
    }
};



const getComputerChoice = randomNumber => {
    Math.random(Math.floor() * 3);
    switch (randomNumber) {
        case 0:
            return 'rock';
            break;
        case 1:
            return 'paper';
            break;
        case 2:
            return 'scissors';
            break;
    }
};

const determineWinner = (userChoice, computerChoice) => {
    if
        (userChoice === computerChoice) {
        return ("Tie!");
    };
    if (userChoice === 'rock') {
        if (computerChoice === 'paper') {
            return "Conputer wins!";
        }
        else {
            return "Human wins!";
        }
    };

    if (userChoice === 'paper') {
        if (computerChoice === 'scissors') {
            return "Computer wins!";
        }
        else {
            return "Human wins!";
        }
    };
    if (userChoice === 'scissors') {
        if (computerChoice === 'rock') {
            return "Computer wins!";
        }
        else {
            return "Human wins!";
        }
    }
};
console.log(determineWinner('paper', 'scissors'));
console.log(determineWinner('paper', 'paper'));
console.log(determineWinner('paper', 'rock'));

function playGame() {
    const userChoice = getUserChoice('scissors',);
    const computerChoice = getComputerChoice();
    console.log("Human drew: " + userChoice);
    console.log('Computer drew:' + computerChoice);

    console.log(determineWinner(userChoice, computerChoice));
};
playGame();


