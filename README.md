# JavaFX HelloWorld Project

This is a simple JavaFX project that demonstrates the basic setup and a simple application displaying "Hello, JavaFX!".

## Prerequisites

- Java 11 or later
- JavaFX SDK 17 or later
- IntelliJ IDEA or Eclipse IDE

## Setup Instructions

### Download JavaFX SDK

1. Visit the [JavaFX Downloads page](https://gluonhq.com/products/javafx/).
2. Download the JavaFX SDK suitable for your operating system.
3. Extract the downloaded file to a preferred location on your system.

### Configure the Project in IntelliJ IDEA

1. Open IntelliJ IDEA and create a new Java project.
2. Go to `File` > `Project Structure`.
3. In the `Project` section, select `Libraries` and click the `+` icon to add a new library.
4. Select `Java` and navigate to the `lib` directory inside the extracted JavaFX SDK folder.
5. Click `OK` to add the JavaFX libraries.
6. Go to `Run` > `Edit Configurations`.
7. In the `VM options` field, add:
--module-path /path/to/javafx-sdk-17/lib --add-modules javafx.controls,javafx.fxml
