package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Pick 'n' Pay");
        System.out.println(organisation);
        Assert.assertNotNull(organisation.getOrgCode(),organisation.getOrgName());

    }
}