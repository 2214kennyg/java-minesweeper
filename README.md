# java-minesweeper

## Requirements / Purpose

-   Building a simplistic version of the game Minesweeper with Java to be played in the console, on a 10 x 10 board.
-   Created during Nology program, to explore and understand how Java works, with a focus on OOP.

---

## Build Steps

-   To play, simply run the code in 'Main' class

---

## Design Goals / Approach

-   To break up the code and use multiple classes to build a game of minesweeper
-   Created 'Cell' class to contain all the logic for a single cell, e.g. if it has a mine, if it is revealed
-   Created 'Board' class to contain the logic for displaying the board, e.g. setting the dimensions, allocating the mines, logic for revealing the cell
-   Created 'Game' class to contain the logic for the user to play the game, e.g. rendering the board, commands to interact with cell, win or lose conditions
-   Created 'Main' class to simply run the game
-   Also considered trying to use interfaces, abstracts or generics, simply to have exposure and try out the content we learned
-   But it overcomplicated the code and wasn't really necessary so eventually opted out

---

## Features

-   Mines are randomly allocated
-   Choose row/col to select cell
-   Can reveal or flag/unflag a cell
-   Board rerenders after each action

---

## Known issues

-   Currently breaks the game if non-number is input for rows/cols -> need to add exception so that the whole code doesn't need to be rerun
-   Still has to input target cells to reveal one at a time -> explored implementing cascade feature but reveals too many cells (including mines)

---

## Future Goals

-   Fixing above mentioned issues
-   Change the 'difficulty' by allowing the rows/cols to be altered by the user (as well as changing the number of mines allocated)
-   Potentially be able to run game without opening code directly? Mount?

---

## Change logs

-

