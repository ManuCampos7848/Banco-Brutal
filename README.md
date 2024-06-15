Este proyecto trata de emular algunas funcionalidades que poseen las aplicaciones de los bancos, tales funcionalidades son por ejemplo: 
-	Crear una cuenta (puede ser de “Ahorros” o “Corriente”).
-	Depositar dinero (desde el lado del cliente).
-	Retirar dinero (desde el lado del cliente).
-	Consultar dinero (desde el lado del cliente).

Por parte del empleado, tiene funcionalidades como:
-	Registrar un nuevo cliente (la cuenta puede ser de “Ahorros” o “Corriente”).
-	Modificar los datos de un cliente.
-	Depositar dinero (a la cuenta del cliente).
-	Retirar dinero (a la cuenta del cliente).
-	Consultar dinero (a la cuenta del cliente).
-	Eliminar clientes.
-	Buscar clientes por su cedula.

Por parte del administrador, tiene funcionalidades como:
-	Registrar un nuevo cliente (la cuenta puede ser de “Ahorros” o “Corriente”).
-	Modificar los datos de un cliente.
-	Depositar dinero (a la cuenta del cliente).
-	Retirar dinero (a la cuenta del cliente).
-	Consultar dinero (a la cuenta del cliente).
-	Eliminar clientes.
-	Buscar clientes por su cedula.
-	Registrar un empleado.
-	Modificar un empleado.
-	Eliminar un empleado.
-	Buscar empleados por su cedula.

Algunas características del proyecto:
-	La clase “Banco” dentro del package “Model” es la que contiene todas las listas de clientes, empleados, administradores y transacciones que se realizan en la aplicación, además de tener también el resto de métodos que permiten el correcto funcionamiento del proyecto.
-	Este proyecto fue realizado con el patrón de diseño modelo vista controlador (MVC).
-	Cuenta con una librería de nombre Fontawesomefx 8.9 la cual fue utilizada para proveer de logos e iconos al proyecto (se encuentra afuera de la carpeta del “src” con el nombre de “librerías”).
-	Para la lista de clientes se utilizó un “HashSet”.
-	Para la lista de empleados y administradores se utilizó un “ArrayList”.
-	Para la lista de cuentas y transacciones se usó “HashMap”.
Para ejecutar el proyecto, iniciar la clase “App” que se encuentra en la carpeta “Aplicación” dentro de “src”. Dentro de “src” de igual manera se encuentra una carpeta de nombre “Imágenes del Funcionamiento” en la que se aprecian diferentes capturas de pantalla del proyecto ejecución, además de poder analizar funcionalidades tanto del cliente como del administrador. Muchas gracias de antemano por el tiempo brindado.

___________________________ English _____________________

This project tries to emulate some functionalities that bank applications have, such functionalities are for example:
- Create an account (it can be “Savings” or “Current”).
- Deposit money (from the client side).
- Withdraw money (from the client side).
- Consult money (from the client side).

On the employee's side, it has functionalities such as:
- Register a new client (the account can be “Savings” or “Current”).
- Modify a client's data.
- Deposit money (to the client's account).
- Withdraw money (to the client's account).
- Consult money (to the client's account).
- Delete clients.
- Search for clients by their ID.

On the administrator's side, it has functionalities such as:
- Register a new client (the account can be “Savings” or “Current”).
- Modify a client's data.
- Deposit money (to the client's account).
- Withdraw money (to the client's account).
- Consult money (to the client's account).
- Delete clients.
- Search for clients by their ID.
- Register an employee.
- Modify an employee.
- Delete an employee.
- Search employees by their ID.

Some features of the project:
- The “Bank” class within the “Model” package is the one that contains all the lists of clients, employees, administrators and transactions that are carried out in the application, in addition to also having the rest of the methods that allow the project to function correctly.
- This project was carried out with the model view controller (MVC) design pattern.
- It has a library called Fontawesomefx 8.9 which was used to provide logos and icons to the project (it is located outside the “src” folder with the name “libraries”).
- A “HashSet” was used for the customer list.
- An “ArrayList” was used for the list of employees and administrators.
- “HashMap” was used for the list of accounts and transactions.
To run the project, start the “App” class found in the “Application” folder within “src”. Within “src” there is also a folder called “Functional Images” in which you can see different screenshots of the execution project, in addition to being able to analyze functionalities of both the client and the administrator. Thank you very much in advance for the time provided.
