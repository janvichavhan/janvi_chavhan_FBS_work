#include <stdio.h>

struct time {
    int hour;
    int min;
    int sec;
};
void displayTime(struct time t);
struct time storeTime();

void main() {
    struct time t1, t2, t3;

    printf("\nEnter details of Time 1:\n");
    t1 = storeTime();

    printf("\nEnter details of Time 2:\n");
    t2 = storeTime();

    printf("\nEnter details of Time 3:\n");
    t3 = storeTime();

    printf("\nEntered Times are:\n");
    displayTime(t1);
    displayTime(t2);
    displayTime(t3);

}


void displayTime(struct time t) {
    printf("Time = %02d:%02d:%02d\n", t.hour, t.min, t.sec);
}

struct time storeTime() {
    struct time temp;
    scanf("%d", &temp.hour);
    scanf("%d", &temp.min);
    scanf("%d", &temp.sec);

    return temp;
}
