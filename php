<?php
function countAndDisplayPositions($words, $character) {
    foreach ($words as $word) {
        $count = 0;
        $positions = [];
        for ($i = 0; $i < strlen($word); $i++) {
            if ($word[$i] === $character) {
                $count++;
                $positions[] = $i;
            }
        }
        echo "Positions of '$character' in $word: " . implode(' ', $positions) . "\n";
        echo "Count of '$character' in $word: $count\n";
    }
}

$words = ["hello", "world", "php", "programming"];
$character = 'l';
countAndDisplayPositions($words, $character);
?>
