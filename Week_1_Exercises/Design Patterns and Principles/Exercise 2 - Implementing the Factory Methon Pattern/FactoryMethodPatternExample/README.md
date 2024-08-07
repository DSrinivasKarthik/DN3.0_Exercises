# FactoryMethodPatternExample

This project demonstrates the Factory Method Pattern in Java by creating different types of documents (Word, PDF, Excel).

## Steps to Implement
1. Define interfaces or abstract classes for different document types.
2. Implement concrete classes for each document type.
3. Create an abstract class `DocumentFactory` with a method `createDocument()`.
4. Create concrete factory classes for each document type.

## How to Run
1. Compile the project using `javac Document.java WordDocument.java PdfDocument.java ExcelDocument.java DocumentFactory.java WordDocumentFactory.java PdfDocumentFactory.java ExcelDocumentFactory.java FactoryTest.java`.
2. Run the test class `FactoryTest` to demonstrate the creation of different document types.
