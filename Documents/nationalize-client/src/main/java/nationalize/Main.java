package nationalize;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.printf("Usage: java %s <name>%n", Main.class.getName());
            System.exit(1);
        }
        /**
         * Client interface to query the possible countries of origin for a last name.
         * The {@link #newInstance()} method is provided to obtain a
         * {@code NationalizeClient} object.
         */
        var client = NationalizeClient.newInstance();
        /**
         * {@return an object implementing the {@code NationalizeClient} interface}
         */
        var nationality = client.getNationality(args[0]);
        System.out.println(nationality);
    }

}
