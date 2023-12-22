function countAndDisplayPositions(words, char) {
  let totalCount = 0;
  let charPositions = [];

  words.forEach(word => {
    let positions = [];
    for (let i = 0; i < word.length; i++) {
      if (word[i] === char) {
        positions.push(i);
        totalCount++;
      }
    }
    console.log(`Character '${char}' appears ${positions.length} times in word '${word}' at positions: ${positions.join(", ")}`);
    charPositions.push({ word: word, positions: positions });
  });

  console.log(`Total occurrences of character '${char}': ${totalCount}`);
  return charPositions;
}
