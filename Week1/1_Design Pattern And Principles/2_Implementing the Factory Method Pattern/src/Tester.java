public class Tester {
    public void runDemo() {
        FileCreator wordGen = new WordFactory();
        FileType word = wordGen.createFile();
        word.launch();

        FileCreator pdfGen = new PDFFactory();
        FileType pdf = pdfGen.createFile();
        pdf.launch();

        FileCreator sheetGen = new SpreadsheetFactory();
        FileType sheet = sheetGen.createFile();
        sheet.launch();
    }
}
