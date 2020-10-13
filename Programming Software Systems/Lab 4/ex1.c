#include<stdio.h>

int main() {

    struct exam_day {
        int day;
        int year;
        enum {
            January,
            February,
            March,
            April,
            May,
            June,
            July,
            August,
            September,
            October,
            November,
            December
        } month;
    };

    struct student {
        char *name;
        char *surname;
        int groupNO;
        struct exam_day exam;
    };

    struct student Student1 =
            {.name = "Joseph", .surname = "Stalin", .groupNO = 2,
                    .exam.day = 25, .exam.year = 2020, .exam.month = September};

    int choice;
    do {
        printf("What information about student do you want to know?\n");
        printf("1 - Name\n2 - Surname\n3 - groupNO\n4 - Next exam day\n"
               "5 - Next exam year\n6 - Next exam month\n0 - Exit\n");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                printf("%s\n", Student1.name);
                break;
            case 2:
                printf("%s\n", Student1.surname);
                break;
            case 3:
                printf("%d\n", Student1.groupNO);
                break;
            case 4:
                printf("%d\n", Student1.exam.day);
                break;
            case 5:
                printf("%d\n", Student1.exam.year);
                break;
            case 6:
                switch ((int) Student1.exam.month) {
                    case January:
                        printf("January\n");
                        break;
                    case February:
                        printf("February\n");
                        break;
                    case March:
                        printf("March\n");
                        break;
                    case April:
                        printf("April\n");
                        break;
                    case May:
                        printf("May\n");
                        break;
                    case June:
                        printf("June\n");
                        break;
                    case July:
                        printf("July\n");
                        break;
                    case August:
                        printf("August\n");
                        break;
                    case September:
                        printf("September\n");
                        break;
                    case October:
                        printf("October\n");
                        break;
                    case November:
                        printf("November\n");
                        break;
                    case December:
                        printf("December\n");
                        break;
                };
                break;
            case 0:
                printf("Goodbye!\n");
                break;
        };
    } while (choice != 0);

    return 0;
}