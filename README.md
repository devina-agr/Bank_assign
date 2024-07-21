# Fun Bank Account Management System

Welcome to our fun and interactive bank account management system! This Java program lets you create, use, update, and delete bank accounts with ease. Ready to manage your virtual wealth? Let's dive in!

## Features

1. **Create Account** 📝
2. **Use Account** 🔑
3. **Update Account** ✏️
4. **Delete Account** 🗑️
5. **Exit** 🚪

## How It Works

### Main Class

#### Fields

- `Scanner sc`: For user input.
- `int count`: Account ID counter.
- `int cc`: Account data manager.
- `ArrayList<String> details`: Holds account details.
- `ArrayList<ArrayList<String>> info`: Holds all accounts.
- `ArrayList<String> passdetails`: Holds account passwords.
- `ArrayList<String> empty`: Placeholder for deleted accounts.
- `ArrayList<String> arr`, `ra`: Temporary storage for operations.
- `int ID`, `actual`: For current operations.
- `ArrayList<String> use_check`, `update_check`: For checking and updating details.

### Classes

#### Create

- **Method**: `void creates()`
- **Does**: Create a new account. Get your ID and set a strong password!

#### Use

- **Method**: `void uses()`
- **Does**: Enter your account ID and password to access your account.

#### Display

- **Method**: `void show()`
- **Does**: Manage your account: Transfer, deposit, withdraw, check balance, or exit.

#### Update

- **Method**: `void updation()`
- **Does**: Update your name, father's name, or mobile number.

#### Delete

- **Method**: `void delete_act()`
- **Does**: Enter your account ID and password to delete your account.

### Main Method

The `main` method displays a fun menu. Choose an option and let the magic happen!

```java
public static void main(String[] args) {
    do {
        System.out.println("Choices:");
        System.out.println("1. Create Account 📝");
        System.out.println("2. Use Account 🔑");
        System.out.println("3. Update Account ✏️");
        System.out.println("4. Delete Account 🗑️");
        System.out.println("5. Exit 🚪");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: new Create().creates(); break;
            case 2: new Use().uses(); break;
            case 3: new Update().updation(); break;
            case 4: new Delete().delete_act(); break;
            case 5: System.exit(0);
        }
    } while (true);
}
