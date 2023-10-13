const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter numbers separated by space: ', (input) => {
  const numbers = input.split(' ').map(Number);

  const sortedArray = numbers.sort((a, b) => b - a);

  console.log("Sorted Array in Descending Order:", sortedArray);

  rl.close();
});
