#include <stdio.h>
struct date {
    int day;
    int month;
    int year;
};

void displayDate(struct date d);
struct date storeDate();

void main() {
    struct date d1, d2, d3;

    printf("\nEnter details of Date 1:\n");
    d1 = storeDate();

    printf("\nEnter details of Date 2:\n");
    d2 = storeDate();

    printf("\nEnter details of Date 3:\n");
    d3 = storeDate();

    printf("\nEntered Dates are:\n");
    displayDate(d1);
    displayDate(d2);
    displayDate(d3);

}

void displayDate(struct date d) {
    printf("Date = %02d/%02d/%04d\n", d.day, d.month, d.year);
}

struct date storeDate() {
    struct date temp;
    scanf("%d", &temp.day);
    scanf("%d", &temp.month);
    scanf("%d", &temp.year);

    return temp;
}
