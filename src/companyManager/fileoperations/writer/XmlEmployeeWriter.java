package companyManager.fileoperations.writer;

import companyManager.Company;
import companyManager.Employee;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XmlEmployeeWriter extends AbstractEmployeeWriter {
    public XmlEmployeeWriter(String pathToFile) {
        super(pathToFile);
    }

    @Override
    public void writeEmployees(Employee[] employees) {
        //tworzymy pusty obiekt bo w cos trzeba opakowac ten korzen (root) xml
        Company companyToSave = new Company();
        //root bedzie mial pracownikow
        companyToSave.setEmployees(employees);
        try {
            //klasa ktora wygeneruje schemat na podstawie naszej klasy
            JAXBContext context = JAXBContext.newInstance(Company.class);
            //proces zapisu obiektu do xml -> marshalling (odwrotnie unmarshalling)
            Marshaller marshaller = context.createMarshaller();
            //ladne sformatowanie pliku
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //jaki element ma zapisac
            marshaller.marshal(companyToSave, new File(pathToFile));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
