//getUserChoice takes in a user's choice and returns the user's choice in lowercase
const getUserChoice = userInput => {
    userInput = userInput.toLowerCase();
    if (userInput === 'rock' || userInput === 'paper' || userInput === 'scissors') {
        return userInput;
    }
    else {
        console.log("Error! try again by entering either rock, paper or scissors.");
    }
};

//getComputerChoice generates a random number (0, 1, or 2) corresponding to rock, paper, or scissors, respectively
const getComputerChoice = () => {
    let randomNumber = Math.floor(Math.random() * 3);
    switch (randomNumber) {
        case 0:
            return 'rock';
        case 1:
            return 'paper';
        case 2:
            return 'scissors';
    }
};

//determineWinner takes in the user's choice and the computer's choice, checks if they're equal, and if not, returns who wins. If they are the same then they "Tie!"
const determineWinner = (userChoice, computerChoice) => {
    if (userChoice === computerChoice) {
        return "Tie!";
    }

    if (userChoice === 'rock') {
        if (computerChoice === 'scissors') {
            return "Human wins!";
        }
        else {
            return "Computer wins!";
        }
    }

    if (userChoice === 'paper') {
        if (computerChoice === 'rock') {
            return "Human wins!";
        }
        else {
            return "Computer wins!";
        }
    }
    if (userChoice === 'scissors') {
        if (computerChoice === 'paper') {
            return "Human wins!";
        }
        else {
            return "Computer wins!";
        }
    }
};

// playGame function calls the three functions to simulate a game of rock, paper, scissors between the human and the computer. The results of the game are printed to the console
function playGame(userInput) {
    const userChoice = getUserChoice(userInput);
    const computerChoice = getComputerChoice();
    console.log("Human chose: " + userChoice);
    console.log('Computer chose:' + computerChoice);

    // Display the user's choice and the computer's choice
    document.getElementById("user-choice").innerText = "Your choice: " + userChoice;
    document.getElementById("computer-choice").innerText = "Computer choice: " + computerChoice;

    // Display the result of the game
    const result = determineWinner(userChoice, computerChoice);
    document.getElementById("result").innerText = result;
    console.log(result);
};

document.getElementById("rock").addEventListener("click", (event) => {
    playGame(event.target.id);
});

document.getElementById("paper").addEventListener("click", (event) => {
    playGame(event.target.id);
});

document.getElementById("scissors").addEventListener("click", (event) => {
    playGame(event.target.id);
});