package companyManager.fileoperations.reader;

import companyManager.Company;
import companyManager.Employee;
import companyManager.fileoperations.util.ParseUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * XML znaczniki
 *   javax.xml.bind.annotation - aby utworzyc w javie
 * <nazwa> </nazwa>          //korzen root -> Company -> adnotacja @XmlRootElement(), getter  @XmlElement()
 *      <id></id>           //wartosc    @XmlAccessorType(XmlAccessType.PROPERTY)
 *      <age a=1> </age>  //atrybut      @XmlAttribute
 *
 *
 * */
public class XmlEmployeeReader extends AbstractEmployeeReader {
    public XmlEmployeeReader(String pathToFile) {
        super(pathToFile);
    }

    @Override
    public Employee[] readEmployees() {
        try {
            JAXBContext context = JAXBContext.newInstance(Company.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Object obj = unmarshaller.unmarshal(new File(pathToFile));
            Company result = (Company) obj;
            return result.getEmployees();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }



    }
}
