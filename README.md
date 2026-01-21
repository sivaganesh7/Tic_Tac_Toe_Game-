# 🎮 Tic Tac Toe Game — Java Command Line Application

<div align="center">


</div>

---

## Introduction

Tic Tac Toe is a classic two-player strategy game where players compete to align three of their symbols in a row. This project implements the game as a **command-line application using Java**, focusing on simplicity, clean structure, and real-world coding practices.

### Perfect For:
- ✨ Java beginners learning fundamentals
- 📚 Backend learners understanding game logic
- 🧠 Logic-building and problem-solving practice
- 🎯 Interview preparation
- 🔄 Understanding system flow and state management

---

## Live Demo (Console Preview)

```
=================================
        TIC TAC TOE GAME
=================================
Instructions:
- Two players take turns (X and O)
- Enter row and column (0 to 2)
- First to get 3 in a row wins
- Example input: 1 2
=================================

Enter Player X name: Rahul
Enter Player O name: Arjun

Current Board:
  0   1   2
0   |   |  
  ---------
1   |   |  
  ---------
2   |   |  

Rahul's turn (X)
Enter row (0-2) and column (0-2): 1 1

Current Board:
  0   1   2
0   |   |  
  ---------
1   |   X  
  ---------
2   |   |  

Arjun's turn (O)
Enter row (0-2) and column (0-2): 0 0

... Game Continues ...
```

---

## 📌 Project Objectives

- ✅ Build a complete Java-based game system
- ✅ Implement user-friendly input handling
- ✅ Design clean and modular code structure
- ✅ Track player scores across multiple rounds
- ✅ Practice core programming concepts
- ✅ Learn real-world logic flow and state management

---

## 🎯 Features

<table>
<tr>
<td width="50%">

### Core Gameplay
- ⚡ Two-player mode (X vs O)
- 👤 Custom player name support
- 🎮 Interactive turn-based gameplay
- 📊 3×3 board visualization
- ✔️ Real-time input validation

</td>
<td width="50%">

### Game Logic
- 🏆 Automatic winner detection
- 🤝 Draw condition detection
- 📈 Score tracking system
- 🔄 Replay option (play multiple rounds)
- 📋 Clear in-game instructions

</td>
</tr>
</table>

---

## 🧩 How the Game Works

```
1️⃣  Game starts with a 3×3 empty board
   ↓
2️⃣  Two players take turns placing symbols (X or O)
   ↓
3️⃣  Players enter row and column values (0–2)
   ↓
4️⃣  Game validates each move for legality
   ↓
5️⃣  Board updates and displays after every move
   ↓
6️⃣  Game checks for winner or draw condition
   ↓
7️⃣  Scores update and players can replay
```

---

## 📥 Installation

### Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- **Command Line Interface** (Terminal/CMD)

### Step-by-Step Setup

#### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/tic-tac-toe-java.git
cd tic-tac-toe-java
```

#### 2️⃣ Verify Java Installation
```bash
java -version
javac -version
```

#### 3️⃣ Compile the Program
```bash
javac -d . production/*.java Main.java
```

#### 4️⃣ Run the Game
```bash
java Main
```

---

## 🕹️ How to Play

### Step 1 — Enter Player Names
```
Enter Player X name: Rahul
Enter Player O name: Arjun
```

### Step 2 — Understanding the Board Layout
The board uses a **coordinate system** (row, column):
```
  0   1   2  ← Column Index
0   |   |     ← Row 0
  ---------
1   |   |     ← Row 1
  ---------
2   |   |     ← Row 2
```

### Step 3 — Make Your Move
When prompted, enter your move as: **`row column`**

**Examples:**
- `1 1` → Place at Row 1, Column 1 (center)
- `0 0` → Place at Row 0, Column 0 (top-left)
- `2 2` → Place at Row 2, Column 2 (bottom-right)

### Step 4 — Win Conditions

A player wins by aligning **3 symbols** in:

| Type | Example |
|------|---------|
| **Horizontal** | Row 0: `X X X` |
| **Vertical** | Column 1: Three X's vertically |
| **Diagonal** | Top-left to bottom-right |
| **Diagonal** | Top-right to bottom-left |

### Step 5 — Draw Condition
If all 9 cells are filled without a winner → **Draw**

### Step 6 — View Score & Replay
```
=================================
         GAME OVER - DRAW!
=================================

Current Scores:
Rahul (X): 2
Arjun (O): 2

Do you want to play again? (y/n): y
```

---

## 🏆 Score System

The game automatically tracks player scores across multiple rounds:

```
=================================
         FINAL SCORES
=================================
Rahul (X): 3
Arjun (O): 1
=================================
```

---

## 📂 Project Structure

```
TicTacToe/
│
├── Main.java                    # Entry point and main game orchestration
├── production/                  # Production folder with modular components
│   ├── Board.java              # Board management (display, validation, moves)
│   ├── GameLogic.java          # Game rules (winner checking, player toggling)
│   ├── Score.java              # Score tracking system
│   └── UIHelper.java           # User interface and input handling
├── README.md                    # Project documentation
└── LICENSE                      # MIT License
```

### Component Overview

| File | Responsibility |
|------|-----------------|
| **Main.java** | Game flow orchestration and main entry point |
| **Board.java** | 3×3 board state, display, and move validation |
| **GameLogic.java** | Winner detection and player alternation |
| **Score.java** | Multi-round score tracking |
| **UIHelper.java** | Console I/O and user prompts |

---

## 💻 Code Architecture

### Modular Design Pattern

The project follows **Single Responsibility Principle (SRP)** with separate classes:

| Class | Responsibility |
|-------|-----------------|
| **Main** | Game flow, orchestration, user interaction loop |
| **Board** | Board initialization, display, move validation, cell management |
| **GameLogic** | Winner detection (rows, columns, diagonals), player toggling |
| **Score** | Maintain player names and scores across rounds |
| **UIHelper** | Display messages, get user input, handle console I/O |

### Key Methods

- `Board.makeMove()` - Place symbol on board
- `GameLogic.checkWinner()` - Check all 8 possible win conditions
- `Score.updateScore()` - Track wins for each player
- `UIHelper.getMove()` - Handle user input safely

---

## 🔧 Technical Details

### Built With
- **Language:** Java 8+ (tested with Java 22)
- **Paradigm:** Object-Oriented Programming (OOP)
- **Architecture:** Modular, package-based structure
- **I/O:** Console input/output with Scanner

### Design Patterns Used
- ✅ Single Responsibility Principle (SRP)
- ✅ Encapsulation and data hiding
- ✅ Separation of concerns
- ✅ Package organization for modularity

---

## 🎓 Learning Outcomes

By exploring this project, you'll learn:

- 🔹 How to structure a complete Java application
- 🔹 Implementing game logic and algorithms
- 🔹 User input handling and validation
- 🔹 Data structure usage (arrays)
- 🔹 Control flow and decision-making
- 🔹 Code organization and best practices

---

## 🐛 Example Game Session

```
=================================
        TIC TAC TOE GAME
=================================
Enter Player X name: Alice
Enter Player O name: Bob

Current Board:
  0   1   2
0   |   |  
  ---------
1   |   |  
  ---------
2   |   |  

Alice's turn (X)
Enter row (0-2) and column (0-2): 1 1

Current Board:
  0   1   2
0   |   |  
  ---------
1   |   X  
  ---------
2   |   |  

Bob's turn (O)
Enter row (0-2) and column (0-2): 0 0

Current Board:
  0   1   2
0 O |   |  
  ---------
1   |   X  
  ---------
2   |   |  

... Game Continues Until Winner or Draw ...

=================================
🎉 CONGRATULATIONS! Alice (X) WINS! 🎉
=================================
```

---

**Happy Gaming! 🎮**

</div>
