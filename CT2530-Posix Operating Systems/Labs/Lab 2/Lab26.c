#include <stdio.h>
#define MAX 50
int countVowel(char word[])
{
    char i = 0;
    int vowel = 0;
    while (word[i] != '\0')
    {
        if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u')
        {
            vowel++;
        }
        else if (word[i] == 'A' || word[i] == 'E' || word[i] == 'I' || word[i] == 'O' || word[i] == 'U')
        {
            vowel++;
        }
        i++;
    }
    return vowel;
}
int main(){
    char word[MAX];
    printf("\nEnter a string : ");
    fgets(word, MAX, stdin);
    int number_of_vowel = countVowel(word);
    printf("Number of Vowels : %d\n", number_of_vowel);
    return 0;
}