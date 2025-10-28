# Software Architecture Lab

### Overview 
A practical lab designed to explore and apply the **five SOLID principles** of object-oriented design to improve modularity, flexibility, and maintainability in software architecture. Implemented in **Java**, this lab focuses on identifying design flaws and refactoring code to align with best practices.

### The SOLID Principles  

### 1. **Single Responsibility Principle (SRP)**  
**Definition:** A class should have one and only one reason to change.  
**Application:**  
- The original `CarManager` class was responsible for handling multiple concerns—data retrieval, formatting, and business logic.  
- It was refactored into three focused classes:  
  - `Repo.java` → Manages car data retrieval and storage.  
  - `Formatter.java` → Handles formatting and display of car information.  
  - `Car.java` → Represents the car entity itself.   
**Result:** Clear separation of responsibilities, easier maintenance, and improved readability.  



### 2. **Open-Closed Principle (OCP)**  
**Definition:** Software entities should be open for extension but closed for modification.  
**Application:**  
- The `ResourceAllocator` class was initially hardcoded to handle only certain resource types.  
- Introduced abstractions in `SpaceSlot.java` and `TimeSlot.java` to extend behavior without changing existing logic.  
**Result:** New resources can now be added without modifying existing code, enhancing scalability and reducing regression risk.  


### 3. **Liskov Substitution Principle (LSP)**  
**Definition:** Subtypes must be substitutable for their base types without altering the correctness of the program.  
**Application:**  
- In a duck simulation system, `ElectronicDuck` violated LSP by not supporting certain behaviors of a normal `Duck`.  
- Refactored using behavioral abstractions:  
  - `Quacking.java` and `Swimming.java` define separate behaviors.  
  - `Pool.java` manages interactions between different duck types.  
**Result:** Both `Duck` and `ElectronicDuck` can now be used interchangeably in the system without unexpected behavior, ensuring safe substitution and code reusability.  


### 4. **Interface Segregation Principle (ISP)**  
**Definition:** Clients should not be forced to depend on interfaces they do not use.  
**Application:**  
- The original `Door` interface contained unrelated methods, forcing implementing classes to handle unnecessary functionalities.  
- Refactored into smaller, purpose-specific interfaces:  
  - `Locking.java`  
  - `Opening.java`  
  - `SensingDoor.java`  
  - `TimedDoor.java`  
  - `Sensor.java`  
  - `TimeOutListener.java` and `Timer.java` for timing and event management.
**Result:** Each class now implements only the methods it requires, increasing modularity and improving maintainability.  


### 5. **Dependency Inversion Principle (DIP)**  
**Definition:** High-level modules should not depend on low-level modules; both should depend on abstractions.  
**Application:**  
- The original `EncodingModule` was tightly coupled with specific file and database implementations.  
- Refactored to use abstraction layers:  
  - `Reader.java` and `Writer.java` act as interfaces.  
  - Concrete classes like `FileDataReader.java`, `NetworkDataReader.java`, `FileDataWriter.java`, and `DatabaseDataWriter.java` provide implementations.  
  - `EncodingModuleClient.java` depends only on the abstract interfaces.  
**Result:** High-level modules are now decoupled from implementation details, allowing new data sources or destinations to be added seamlessly.  


## Key Takeaways  
- SOLID principles help prevent tightly coupled and rigid architectures.  
- Refactoring toward SOLID improves testability, readability, and adaptability to change.  
- Applying these principles fosters better design thinking and long-term software sustainability.  



## Technologies Used  
- **Language:** Java  
- **Concepts:** Object-Oriented Design, Interface Abstraction, Code Refactoring  

