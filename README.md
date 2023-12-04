# Color Note

### Overview
Note App is a mobile application designed to create and view notes with a focus on clean architecture using MVVM, CRUD operations, Room, and Jetpack Compose. Clean architecture is a software design principle that advocates for the separation of concerns and logical distribution of code to facilitate the application’s evolution, testing, and maintenance. 
### The different layers of Clean Architecture
#### Data Layer
The data layer encapsulates the details of data sources and persistence, thus shielding the internal layers. It is responsible for retrieving and storing data through a defined repository.
#### Domain Layer
The domain layer defines the software’s core elements, independent of specific application layers. It includes business models, rules, entities, and use cases.
#### Use Case Layer
The Use Case layer is critical as it houses the business logic of our application. It manages the specific operational rules of a system. This layer should know how to execute business logic without any knowledge from the outer layers. In essence, it requires and depends on abstractions from the data layer when necessary and uses them to perform particular business rules.
#### Presentation Layer
This layer acts as the application’s presentation layer, involving aspects such as user interface design, user interaction, and data presentation.
### Features
#### Notes screen
View and manage your notes with the ability to easily add, edit, and delete notes.
#### Sorting
Sort notes by name, creation time, or color in ascending or descending order quickly.
#### Rotate the note
If you accidentally delete a note, bring it back using the snack bar.
#### Add/Edit Notes screen 
Create or edit notes with a dynamic and visually appealing interface.
#### Color change animation
Seamlessly change the color of your note with 5 colors to choose from.
