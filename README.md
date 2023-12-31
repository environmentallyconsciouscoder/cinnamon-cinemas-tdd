# Cinnamon Cinemas Exercise

## Project description

In the MVP (Minimum Viable Product), users can request between 1 to 3 tickets through the booking system, which will subsequently check the availability of seats and allocate them to the user. The allocation process follows a sequence starting from row A to C, moving from left to right.

There are a total of 15 seats available, with 5 seats in each row. There are three rows labeled from A to C. The future roadmap includes plans to adjust the number of seats and rows to accommodate different cinema setups.

## Installation

Please ensure that you have Java and Maven installed on your computer. To run the unit tests, use the command 'mvn test'.


## Approaches

I will implement a queue data structure to manage seat requests, following the 'first in, first out' (FIFO) principle to process requests in the order they are received. To store the seat status and associated user information, I will utilize a list of hash tables or hash maps. When a seat is occupied, its corresponding value will be set to 'true,' and if it remains unoccupied, it will be set to 'false.' Below is an example illustrating what the data structure looks like. 

````
[  
     [
        {
        "is_booked": true,
        },
        {
        "is_booked": true,
        },
        {
        "is_booked": true,
        },
        {
        "is_booked": true,
        },
        {
        "is_booked": true,
        }
    ],
    [
        {
        "is_booked": true,
        },
        {
        "is_booked": true,
        },
        {
        "is_booked": true,
        },
        {
        "is_booked": false,
        },
        {
        "is_booked": false,
        }
     ],
     [
        {
        "is_booked": false,
        },
        {
        "is_booked": false,
        },
        {
        "is_booked": false,
        },
        {
        "is_booked": false,
        },
        {
        "is_booked": false,
        }
        ]
    }
]
````