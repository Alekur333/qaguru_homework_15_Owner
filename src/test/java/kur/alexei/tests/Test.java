package kur.alexei.tests;

import config.CredentialsConfig;
import kur.alexei.pages.TestBase;
import org.aeonbits.owner.ConfigFactory;

public class Test extends TestBase {

    public CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);

}
