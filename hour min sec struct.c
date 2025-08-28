//Time (hour, min, sec) using structure.c
#include <stdio.h>
struct Time {
    int hour;
    int min;
    int sec;
};

void main() {
    struct Time t1, t2;

    t1.hour = 10;
    t1.min = 30;
    t1.sec = 45;

    printf("Enter second time (hh mm ss): ");
    scanf("%d %d %d", &t2.hour, &t2.min, &t2.sec);

  
    printf("%02d:%02d:%02d\n", t1.hour, t1.min, t1.sec);


    printf("%02d:%02d:%02d\n", t2.hour, t2.min, t2.sec);

    
}
