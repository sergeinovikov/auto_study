package lesson12.task3;

import main.lesson12.task3.*;
import main.lesson12.task3.document.*;
import main.lesson12.task3.project.*;
import main.lesson12.task3.person.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class DeserializationFromJson {

    @Test
    public void personFromJson() throws IOException {
        String json = new String(Files.readAllBytes(Paths.get("1\\src\\main\\lesson12\\task3\\inputFiles\\person.json")), Charset.defaultCharset());
        Person personFromJson = (Person) new JsonHelper().deserialize(json, Person.class);


        Assertions.assertEquals("Иван", personFromJson.getName());

        Assertions.assertEquals(37, personFromJson.getAge());

        Mother mother = new Mother("Ольга",
                58
        );
        Assertions.assertEquals(mother, personFromJson.getMother());

        String[] children = new String[]{
                "Маша",
                "Игорь",
                "Таня"
        };
        Assertions.assertArrayEquals(children, personFromJson.getChildren());

        Assertions.assertEquals(true, personFromJson.getMarried());

        Assertions.assertNull(personFromJson.getDog());
    }

    @Test
    public void projectFromJson() throws IOException {
        String json = new String(Files.readAllBytes(Paths.get("1\\src\\main\\lesson12\\task3\\inputFiles\\project.json")), Charset.defaultCharset());
        Project projectFromJson = (Project) new JsonHelper().deserialize(json, Project.class);


        Assertions.assertEquals(154, projectFromJson.getId());

        Assertions.assertEquals("2020-07-14", projectFromJson.getStartDate());

        Assertions.assertEquals("2020-10-01", projectFromJson.getEndDate());

        Assertions.assertEquals("automation_current", projectFromJson.getName());

        int[] childIds_child = new int[]{
                157,
                192,
                198
        };
        Assertions.assertArrayEquals(childIds_child, projectFromJson.getChildIds());

        Permissions[] permissions = new Permissions[]{
                new Permissions(
                        17,
                        "Обновление данных"
                ),
                new Permissions(
                        18,
                        "Создание данных"
                ),
                new Permissions(
                        19,
                        "Удаление данных"
                )
        };
        Assertions.assertArrayEquals(permissions, projectFromJson.getPermissions());

        Assertions.assertEquals(19, projectFromJson.getParentProject().getId());
        Assertions.assertEquals("2020-05-14", projectFromJson.getParentProject().getStartDate());
        Assertions.assertEquals("2021-10-01", projectFromJson.getParentProject().getEndDate());
        Assertions.assertEquals("automation", projectFromJson.getParentProject().getName());
        int[] childIds_parent = new int[]{
                154,
                157,
                192,
                198
        };
        Assertions.assertArrayEquals(childIds_parent, projectFromJson.getParentProject().getChildIds());
        Assertions.assertArrayEquals(permissions, projectFromJson.getParentProject().getPermissions());
        Assertions.assertNull(projectFromJson.getParentProject().getParentProject());
    }

    @Test
    public void documentFromJson() throws IOException {
        String json = new String(Files.readAllBytes(Paths.get("1\\src\\main\\lesson12\\task3\\inputFiles\\document.json")), Charset.defaultCharset());
        Document documentFromJson = (Document) new JsonHelper().deserialize(json, Document.class);


        Assertions.assertEquals(3163, documentFromJson.getId());

        Assertions.assertEquals(2663, documentFromJson.getEdocRefId());

        Assertions.assertEquals("0000000441|00000000000000003163", documentFromJson.getGlobalId());

        Assertions.assertEquals(188, documentFromJson.getTypeId());

        Assertions.assertEquals("WEB", documentFromJson.getChannel());

        Assertions.assertEquals("15", documentFromJson.getDocumentNumber());

        Assertions.assertEquals("2020-09-25", documentFromJson.getDocumentDate());

        Assertions.assertEquals(4, documentFromJson.getVersion());

        Assertions.assertNull(documentFromJson.getRead());

        Client client = new Client(
                657376,
                9479,
                "6449042973",
                "ООО \"Рога и копыта\"",
                "ООО \"Рога и копыта\""
        );
        Assertions.assertEquals(client, documentFromJson.getClient());

        Status status = new Status(
                "SIGNED",
                "Подписан",
                null,
                null,
                null
        );
        Assertions.assertEquals(status, documentFromJson.getStatus());

        Assertions.assertEquals(0, documentFromJson.getCheckResults().length);

        Assertions.assertNull(documentFromJson.getSellingPoint());

        Assertions.assertEquals(13, documentFromJson.getIdentityDocument().getIdentityDocType().getId());
        Assertions.assertEquals(0, documentFromJson.getIdentityDocument().getIdentityDocType().getVersion());
        Name name = new Name(
                "Паспорт гражданина РФ"
        );
        Assertions.assertEquals(name, documentFromJson.getIdentityDocument().getIdentityDocType().getName());
        Assertions.assertEquals("MANDATORY", documentFromJson.getIdentityDocument().getIdentityDocType().getSeriesPresence());
        Assertions.assertEquals("MANDATORY", documentFromJson.getIdentityDocument().getIdentityDocType().getIssueSubdivisionPresence());

        Assertions.assertEquals("7009", documentFromJson.getIdentityDocument().getSeries());
        Assertions.assertEquals("894549", documentFromJson.getIdentityDocument().getNumber());
        Assertions.assertEquals("2016-09-29", documentFromJson.getIdentityDocument().getIssueDate());
        Assertions.assertEquals("mZeJHLTRlb", documentFromJson.getIdentityDocument().getIssuer());
        Assertions.assertEquals("885236", documentFromJson.getIdentityDocument().getIssuerSubdivision());
        Assertions.assertEquals("WiImcktJhx", documentFromJson.getIdentityDocument().getLastName());
        Assertions.assertEquals("ndsFuaNGCB", documentFromJson.getIdentityDocument().getFirstName());
        Assertions.assertEquals("HBKdCEImRV", documentFromJson.getIdentityDocument().getMiddleName());

        Assertions.assertNull(documentFromJson.getClientExternalIds());

        Assertions.assertEquals(76827485, documentFromJson.getBankAccount().getAccount().getId());
        Assertions.assertEquals(332, documentFromJson.getBankAccount().getAccount().getVersion());
        Assertions.assertEquals("40701810683938574392", documentFromJson.getBankAccount().getAccount().getAccountNumber());
        Assertions.assertEquals("042201234", documentFromJson.getBankAccount().getAccount().getBic());

        Assertions.assertEquals(97, documentFromJson.getBankAccount().getAccount().getBranch().getId());
        Assertions.assertEquals(19, documentFromJson.getBankAccount().getAccount().getBranch().getVersion());
        Assertions.assertNull(documentFromJson.getBankAccount().getAccount().getBranch().getHeadBranch());
        Assertions.assertNull(documentFromJson.getBankAccount().getAccount().getBranch().getBic());
        Assertions.assertEquals("ОФИС В Г.НОРИЛЬСКЕ", documentFromJson.getBankAccount().getAccount().getBranch().getShortName());
        Assertions.assertEquals("Europe/Moscow", documentFromJson.getBankAccount().getAccount().getBranch().getTimeZone());
        Assertions.assertNull(documentFromJson.getBankAccount().getAccount().getBranch().getBranchAddresses());
        Assertions.assertEquals(true, documentFromJson.getBankAccount().getAccount().getBranch().getCurrencyTrifle());
        Assertions.assertEquals("1234", documentFromJson.getBankAccount().getAccount().getBranch().getCode_TFU());

        Assertions.assertEquals(1234, documentFromJson.getBankAccount().getBank().getId());
        Assertions.assertEquals(0, documentFromJson.getBankAccount().getBank().getVersion());
        Assertions.assertEquals("042201234", documentFromJson.getBankAccount().getBank().getBic());
        Assertions.assertNull(documentFromJson.getBankAccount().getBank().getPlace());
        Assertions.assertNull(documentFromJson.getBankAccount().getBank().getName());
        Assertions.assertNull(documentFromJson.getBankAccount().getBank().getPlaceType());
        Assertions.assertEquals("042201234", documentFromJson.getBankAccount().getBank().getBic());

        Assertions.assertEquals(97, documentFromJson.getOperBranch().getBranch().getId());
        Assertions.assertEquals(19, documentFromJson.getOperBranch().getBranch().getVersion());
        Assertions.assertNull(documentFromJson.getOperBranch().getBranch().getHeadBranch());
        Assertions.assertNull(documentFromJson.getOperBranch().getBranch().getBic());
        Assertions.assertEquals("ОФИС В Г.НОРИЛЬСКЕ", documentFromJson.getOperBranch().getBranch().getShortName());
        Assertions.assertEquals("Europe/Moscow", documentFromJson.getOperBranch().getBranch().getTimeZone());
        Assertions.assertNull(documentFromJson.getOperBranch().getBranch().getBranchAddresses());
        Assertions.assertEquals(true, documentFromJson.getOperBranch().getBranch().getCurrencyTrifle());
        Assertions.assertEquals("1234", documentFromJson.getOperBranch().getBranch().getCode_TFU());

        Assertions.assertEquals(1234, documentFromJson.getOperBranch().getBank().getId());
        Assertions.assertEquals(0, documentFromJson.getOperBranch().getBank().getVersion());
        Assertions.assertEquals("042201234", documentFromJson.getOperBranch().getBank().getBic());
        Assertions.assertNull(documentFromJson.getOperBranch().getBank().getPlace());
        Assertions.assertNull(documentFromJson.getOperBranch().getBank().getName());
        Assertions.assertNull(documentFromJson.getOperBranch().getBank().getPlaceType());

        Assertions.assertEquals("2020-10-02", documentFromJson.getOperationDate());

        Assertions.assertEquals("OabGcWdoxv", documentFromJson.getDescription());

        Currency currency = new Currency(
                156,
                0,
                "RUR",
                "810",
                "российский рубль"
        );
        Assertions.assertEquals(currency, documentFromJson.getCurrency());

        Assertions.assertEquals("43000.00", documentFromJson.getAmount());

        Arrays.stream(documentFromJson.getSymbolAmounts())
                .forEach(
                        amount -> {
                            Assertions.assertEquals("43000.00", amount.getAmount());
                            Assertions.assertEquals(40, amount.getCashSymbol().getId());
                            Assertions.assertNull(amount.getCashSymbol().getVersion());
                            Assertions.assertEquals("Поступления наличных денег через банкоматы кредитных организаций", amount.getCashSymbol().getName());
                            Assertions.assertNull(amount.getCashSymbol().getIsExpense());
                            Assertions.assertNull(amount.getCashSymbol().getWeight());
                        }

                );
        Assertions.assertEquals(1, documentFromJson.getSymbolAmounts().length);

        Arrays.stream(documentFromJson.getCashQuantities())
                .filter(cashQuantities -> cashQuantities.getQuantity() == 8)
                .forEach(
                        cashQuantities -> {
                            Assertions.assertNull(cashQuantities.getCash().getId());
                            Assertions.assertNull(cashQuantities.getCash().getVersion());
                            Assertions.assertNull(cashQuantities.getCash().getCurrencyNumericCodeIso());
                            Assertions.assertEquals(5000.0, cashQuantities.getCash().getNominal());
                            Assertions.assertEquals("5000,00 руб.", cashQuantities.getCash().getDescription());
                            Assertions.assertEquals(false, cashQuantities.getCash().getCoin());
                        }
                );
        Arrays.stream(documentFromJson.getCashQuantities())
                .filter(cashQuantities -> cashQuantities.getQuantity() == 1 && cashQuantities.getCash().getNominal() == 2000.0)
                .forEach(
                        cashQuantities -> {
                            Assertions.assertNull(cashQuantities.getCash().getId());
                            Assertions.assertNull(cashQuantities.getCash().getVersion());
                            Assertions.assertNull(cashQuantities.getCash().getCurrencyNumericCodeIso());
                            Assertions.assertEquals(2000.0, cashQuantities.getCash().getNominal());
                            Assertions.assertEquals("2000,00 руб.", cashQuantities.getCash().getDescription());
                            Assertions.assertEquals(false, cashQuantities.getCash().getCoin());
                        }
                );
        Arrays.stream(documentFromJson.getCashQuantities())
                .filter(cashQuantities -> cashQuantities.getQuantity() == 1 && cashQuantities.getCash().getNominal() == 1000.0)
                .forEach(
                        cashQuantities -> {
                            Assertions.assertNull(cashQuantities.getCash().getId());
                            Assertions.assertNull(cashQuantities.getCash().getVersion());
                            Assertions.assertNull(cashQuantities.getCash().getCurrencyNumericCodeIso());
                            Assertions.assertEquals(1000.0, cashQuantities.getCash().getNominal());
                            Assertions.assertEquals("1000,00 руб.", cashQuantities.getCash().getDescription());
                            Assertions.assertEquals(false, cashQuantities.getCash().getCoin());
                        }
                );
        Assertions.assertEquals(3, documentFromJson.getCashQuantities().length);

        Assertions.assertNull(documentFromJson.getCommissionAccount());

        Assertions.assertNull(documentFromJson.getBudget());

        Assertions.assertEquals(0, documentFromJson.getBudgetAmounts().length);

        Assertions.assertNull(documentFromJson.getClassifier());

        Assertions.assertNull(documentFromJson.getNoteFromBank());

        Assertions.assertNull(documentFromJson.getCancelRequest());

        Assertions.assertEquals(false, documentFromJson.getCancelReqInProgress());
    }
}
