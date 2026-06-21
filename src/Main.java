import java.util.*;


interface Document {
    void open();
}

class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}

abstract class DocumentFactory {


    public abstract Document createDocument();


    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}

class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}


class main{
    public static void main(String[] args) {

        DocumentFactory factory;

        factory = new WordFactory();
        factory.openDocument();

        factory = new PdfFactory();
        factory.openDocument();

    }
}