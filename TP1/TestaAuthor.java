public class TestaAuthor {
    static public void main(String[] args) {
        Author author = new Author("Leticia Vitoria Rodrigues Rosa", "l.rosa@aluno.ifsp.edu.br", 'm');
        System.out.println("toString: " + author.toString());
        author.setEmail("l.rosa@ifsp.edu.br");
        System.out.println("getName: " + author.getName());
        System.out.println("getEmail: " + author.getEmail());
        System.out.println("getGender: " + author.getGender());
    }
}