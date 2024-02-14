#include <stdio.h>

int main() {
    int c = 12345; // Replace with your number
    int original_c = c;

    int firstMax = -1;
    int secondMax = -1;

    while (c > 0) {
        int digit = c % 10;

        if (digit > firstMax) {
            secondMax = firstMax;
            firstMax = digit;
        } else if (digit > secondMax && digit != firstMax) {
            secondMax = digit;
        }

        c /= 10;
    }

    if (secondMax == -1) {
        printf("There is no second-largest digit in %d.\n", original_c);
    } else {
        printf("Second-largest digit in %d: %d\n", original_c, secondMax);
    }

    return 0;
}
   
