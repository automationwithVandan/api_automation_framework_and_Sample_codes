## What This Project Covers:

### **📊 Multi-Layer JSON Data**
- Static JSON data with nested objects (User → Contact → Address → Company → Department)
- Complex nested structure handling

### **🔧 Two Parsing Approaches**
- **Manual Parsing**: Direct property access using js.getString("a.b.c.d")// for example
- **POJO Mapping**: Automatic conversion using Jackson ObjectMapper

### **🏗️ POJO Classes Created**
- User, Skills, Contact, Address, Company, Department classes
- Proper getters/setters and constructors

### **🌐 Mock API Integration**
- Created mock APIs for testing
- GET API calls to fetch user data
- POST API calls to send user data

### **⚙️ ObjectMapper Examples**
- JSON to Java object conversion
- Java object to JSON conversion
- Error handling and configuration

### **💻 Practical Implementation**
- Real working code examples
- Complete project structure
- Ready-to-run demonstrations

That's it - focused exactly on what you built!

mock_server_api_with_pojo/
├── ApiDataFetcher.java          # Main API client class
├── User.java                    # User POJO
├── Skills.java                  # Skills POJO  
├── Contact.java                 # Contact POJO
├── Address.java                 # Address POJO
├── Company.java                 # Company POJO
├── Department.java              # Department POJO
├── UserResponse.java            # API response wrapper
└── Multi_Layer_JSON_Data.java   # Static JSON data provider

