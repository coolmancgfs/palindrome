A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward as forward.

1. Return true if the string is a palindrome after ignoring case and non-alphanumeric characters (letters and numbers), and false otherwise.
2. Case should be ignored.
3. Non-alphanumeric characters should be ignored: Punctuation, spaces, symbols, etc.
4. If the input string is null throw an IllegalArgumentException.
5. An empty string or a string containing only non-alphanumeric characters is considered a valid palindrome.

Please use Test Driven Development style to show how you would prove your code works.

Examples:
1. isPalindrome "Racecar" == true
2. isPalindrome "race a car" == true
3. isPalindrome "Was it a car or a cat I saw?" == true -ignore special characters
4. isPalindrome "hello" == false
5. isPalindrome ",,,!!" == true -only non-alpahnumeric characters 
6. isPalindrome "" == true -empty string
