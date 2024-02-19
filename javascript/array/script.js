let secretMessage = ['Learning', 'is', 'not', 'about', 'what', 'you', 'get', 'easily', 'the', 'first', 'time,', 'it', 'is', 'about', 'what', 'you', 'can', 'figure', 'out.', '-2015,', 'Chris', 'Pine,', 'Learn', 'JavaScript'];
secretMessage.pop();
//console.log(secretMessage);// removed last word of array
//console.log(secretMessage.length);//23

secretMessage.push('to', 'Program');
//console.log(secretMessage.length); //words added to end of array, count 25

secretMessage.shift();
//console.log(secretMessage); //Learning removed from start of array

secretMessage.unshift('Programming');
//console.log(secretMessage);// added Programming to start of array 

secretMessage.splice(6, 5, 'know');
//console.log(secretMessage);// removed 5 words starting at index 6 and added know. 

console.log(secretMessage.join());//Prints as a a message 