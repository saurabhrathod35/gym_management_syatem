# 🏋️‍♂️ Gym Management System

A Java-based application to manage gym memberships, trainers, and equipment. The system provides a user-friendly interface for gym administrators to handle daily operations efficiently, including membership registration, pass creation, trainer management, and equipment tracking.

## 📌 Features

- Register new gym members
- Create and manage membership passes
- Manage trainers and their schedules
- Track gym equipment details
- View member details and history
- Admin dashboard for all operations

## 🛠️ Technologies Used

- **Frontend:** Java Swing
- **Backend:** Java (JDBC)
- **Database:** MySQL
- **Architecture:** MVC (Model-View-Controller)
- **IDE:** Eclipse/NetBeans
- **Build Tool:** None (manual compilation)

## 📁 Folder Structure

```
gym_management_syatem/
├── src/
│   ├── controller/       # Business logic and control flow
│   ├── model/            # Data model classes
│   ├── view/             # UI Forms (Java Swing)
│   ├── db/               # Database connection logic
│   └── main/             # Main class to start application
├── lib/                  # External libraries (if any)
├── resources/            # Images, SQL scripts, configs
├── README.md
└── gym_management.sql    # Database schema and sample data
```

## ⚙️ Getting Started

### ✅ Prerequisites

- Java JDK 8 or higher
- MySQL Server
- Eclipse or NetBeans

### 🔧 Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/saurabhrathod35/gym_management_syatem.git
   cd gym_management_syatem
   ```

2. **Import the project into your IDE**

3. **Set up the database**
   - Open MySQL and run the `gym_management.sql` file in the root directory
   - Update DB connection details in the DB utility class (e.g., `db/DBConnection.java`)

4. **Run the application**
   - Execute the `main/Main.java` class

## 📷 Screenshots

> Add screenshots of your UI here if available

## 🚀 Future Enhancements

- Add reporting module (PDF export)
- User authentication system
- Online booking and attendance tracking
- REST API for mobile integration

## 👤 Author

**Saurabh Rathod**  
GitHub: [@saurabhrathod35](https://github.com/saurabhrathod35)

## 📄 License

This project is open-source and available under the MIT License.
