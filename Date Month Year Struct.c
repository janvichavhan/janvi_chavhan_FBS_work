//Date (date, month, year) using structure.
#include <stdio.h>
struct Date {
    int date;
    int month;
    int year;
};

void main() {
    struct Date d1, d2;
    d1.date = 13;
    d1.month = 3;
    d1.year = 2003;
    
    printf("Enter second date (dd mm yyyy): ");
    scanf("%d %d %d", &d2.date, &d2.month, &d2.year);

    printf("%02d-%02d-%04d\n", d1.date, d1.month, d1.year);


    printf("%02d-%02d-%04d\n", d2.date, d2.month, d2.year);

}
