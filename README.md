# Advanced Logger System 📝

A robust, enterprise-grade logging system implementing multiple design patterns including Singleton, Chain of Responsibility, and Observer patterns.

## 🎯 Features

- Thread-safe singleton logger instance
- Hierarchical logging levels (INFO, ERROR, DEBUG)
- Multiple output channels (Console, File)
- Flexible observer registration
- Chain of responsibility for log processing
- Extensible architecture

## 🚀 Quick Start

1. Get Logger Instance:
```java
Logger logger = Logger.getInstance();
```

2. Log Messages:
```java
logger.info("Information message");
logger.error("Error message");
logger.debug("Debug message");
```

3. Configure Observers:
```java
LogSubject subject = LogManager.getLogSubject();
subject.addObserver(LogLevel.ERROR, new FileLogObserver());
```

## 🏗 Architecture

The system follows a "Newspaper Publishing House" model:

```
[Client] → [Logger Singleton] → [Logger Chain] → [Log Subject] → [Observers]
            (Publishing House)   (Editors)        (Distribution)  (Readers)
```

### Log Levels
- INFO (1): General information
- ERROR (2): Error conditions
- DEBUG (3): Debug information

## 📦 Components

1. **Core**
   - `Logger`: Singleton entry point
   - `AbstractLogger`: Base logger class
   - `LogSubject`: Observer manager
   - `LogLevel`: Logging levels enum

2. **Loggers**
   - `InfoLogger`
   - `ErrorLogger`
   - `DebugLogger`

3. **Observers**
   - `ConsoleLogObserver`
   - `FileLogObserver`

## 🛠 Setup

1. Clone the repository:
```bash
git clone https://github.com/yourusername/advanced-logger.git
```

2. Include in your project
3. Initialize logger
4. Configure observers as needed

## 📖 Documentation

For detailed documentation, see [DOCUMENTATION.md](DOCUMENTATION.md)

## 🤝 Contributing

1. Fork the repository
2. Create feature branch
3. Commit changes
4. Push to branch
5. Open pull request

## 📄 License

MIT License

## ✨ Mental Model

Think of this system as a newspaper publishing house:
- Single publishing house (Logger)
- Multiple editors (Logger Chain)
- Various distribution channels (Observers)
- Different types of news (Log Levels)


## ✍️ Author

Shubham
