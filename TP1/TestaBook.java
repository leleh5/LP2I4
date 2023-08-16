public class TestaBook {
    static public void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Autora 01", "l.rosa@aluno.ifsp.edu.br", 'f');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        Book testeBook1 = new Book("Java for Dummy", authors, 19.99);
        System.out.println("getName: " + testeBook1.getName());
        System.out.println("getAuthors: " + testeBook1.getAuthors());
        System.out.println("getPrice: " + testeBook1.getPrice());
        testeBook1.setPrice(18.00);
        System.out.println("novo getPrice: " + testeBook1.getPrice());
        System.out.println("getQty: " + testeBook1.getQty());
        testeBook1.setQty(10);
        System.out.println("novo getQty: " + testeBook1.getQty());
        System.out.println("Autores: " + testeBook1.getAuthorNames());

        Book testeBook2 = new Book("Python", authors, 19.99, 99);
        System.out.println("Livro 2: " + testeBook2.toString());
    }
}