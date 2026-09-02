# Mini ATM System (Java)

A simple **console-based ATM simulation** built using Java. This project demonstrates core Java concepts such as **OOP (Object-Oriented Programming), user input handling, validation, and basic banking operations**.

---

## 📌 Features

- 🔐 User Authentication (Account Number + PIN)
- 💰 Check Account Balance
- ➕ Deposit Money
- ➖ Withdraw Money
- 📜 Transaction History
- ❌ Exit System
- 🛡️ Basic input validation for banking operations

---

## 🛠️ Technologies Used

- Java (Core Java)
- OOP Concepts (Encapsulation, Classes, Methods)
- Java Collections (`ArrayList`)
- Scanner (User Input)

---

## 📂 Project Structure

```text
MiniATM.java
 ├── ATM Class
 │    ├── authenticate()
 │    ├── checkBalance()
 │    ├── deposit()
 │    ├── withdraw()
 │    └── showTransactionHistory()
 │
 └── Main Class (MiniATM)
      └── Menu-driven program
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/BhandMB/MiniATM.git
```

2. Navigate to the project folder:

```bash
cd MiniATM
```

3. Compile the program:

```bash
javac MiniATM.java
```

4. Run the program:

```bash
java MiniATM
```

---

## 🔑 Default Login Credentials

```text
Account Number: 123456789
PIN: 1234
```

---

## 💡 Sample Menu

```text
--- ATM Menu ---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Transaction History
5. Exit
```

---

## 📸 Example Output

```text
Welcome to Mini ATM System!
Enter Account Number: 123456789
Enter PIN: 1234

Login successful!

--- ATM Menu ---
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Transaction History
5. Exit
```

---

## 🚀 Future Enhancements

- Multiple user accounts support
- PIN encryption for security
- GUI version using Java Swing or JavaFX
- Database integration (MySQL)
- ATM card simulation

---

## 📚 Learning Outcomes

- Understanding of **Java classes and objects**
- Hands-on experience with **control structures**
- Working with **collections (ArrayList)**
- Building **menu-driven applications**
- Practicing input validation and defensive programming

---

## 🧪 Manual Testing Checklist

Before considering a change complete, verify:

- [ ] Correct account number and PIN authenticate successfully
- [ ] Invalid credentials are rejected
- [ ] Balance inquiry shows the current balance
- [ ] Deposits increase the balance correctly
- [ ] Withdrawals decrease the balance correctly
- [ ] Invalid or excessive withdrawals are rejected
- [ ] Transaction history records completed operations
- [ ] Exit closes the menu cleanly

---

## 📝 Maintenance Notes

README documentation was refreshed on **September 2, 2026** with a manual testing checklist covering authentication, transactions, validation, and exit behavior.
