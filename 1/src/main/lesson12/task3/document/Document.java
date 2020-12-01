package main.lesson12.task3.document;

import java.util.Arrays;
import java.util.Objects;

public class Document {
    private int id;
    private int edocRefId;
    private String globalId;
    private int typeId;
    private String channel;
    private String documentNumber;
    private String documentDate;
    private int version;
    private Object read;
    private Client client;
    private Status status;
    private Object[] checkResults;
    private Object sellingPoint;
    private IdentityDocument identityDocument;
    private Object clientExternalIds;
    private BankAccount bankAccount;
    private OperBranch operBranch;
    private String operationDate;
    private String description;
    private Currency currency;
    private String amount;
    private SymbolAmounts[] symbolAmounts;
    private CashQuantities[] cashQuantities;
    private Object commissionAccount;
    private Object budget;
    private Object[] budgetAmounts;
    private Object classifier;
    private Object noteFromBank;
    private Object cancelRequest;
    private Object cancelReqInProgress;

    public int getId() {
        return id;
    }

    public int getEdocRefId() {
        return edocRefId;
    }

    public String getGlobalId() {
        return globalId;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getChannel() {
        return channel;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public int getVersion() {
        return version;
    }

    public Object getRead() {
        return read;
    }

    public Client getClient() {
        return client;
    }

    public Status getStatus() {
        return status;
    }

    public Object[] getCheckResults() {
        return checkResults;
    }

    public Object getSellingPoint() {
        return sellingPoint;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public Object getClientExternalIds() {
        return clientExternalIds;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public OperBranch getOperBranch() {
        return operBranch;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public String getDescription() {
        return description;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getAmount() {
        return amount;
    }

    public SymbolAmounts[] getSymbolAmounts() {
        return symbolAmounts;
    }

    public CashQuantities[] getCashQuantities() {
        return cashQuantities;
    }

    public Object getCommissionAccount() {
        return commissionAccount;
    }

    public Object getBudget() {
        return budget;
    }

    public Object[] getBudgetAmounts() {
        return budgetAmounts;
    }

    public Object getClassifier() {
        return classifier;
    }

    public Object getNoteFromBank() {
        return noteFromBank;
    }

    public Object getCancelRequest() {
        return cancelRequest;
    }

    public Object getCancelReqInProgress() {
        return cancelReqInProgress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (id != document.id) return false;
        if (edocRefId != document.edocRefId) return false;
        if (typeId != document.typeId) return false;
        if (version != document.version) return false;
        if (!Objects.equals(globalId, document.globalId)) return false;
        if (!Objects.equals(channel, document.channel)) return false;
        if (!Objects.equals(documentNumber, document.documentNumber))
            return false;
        if (!Objects.equals(documentDate, document.documentDate))
            return false;
        if (!Objects.equals(read, document.read)) return false;
        if (!Objects.equals(client, document.client)) return false;
        if (!Objects.equals(status, document.status)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(checkResults, document.checkResults)) return false;
        if (!Objects.equals(sellingPoint, document.sellingPoint))
            return false;
        if (!Objects.equals(identityDocument, document.identityDocument))
            return false;
        if (!Objects.equals(clientExternalIds, document.clientExternalIds))
            return false;
        if (!Objects.equals(bankAccount, document.bankAccount))
            return false;
        if (!Objects.equals(operBranch, document.operBranch)) return false;
        if (!Objects.equals(operationDate, document.operationDate))
            return false;
        if (!Objects.equals(description, document.description))
            return false;
        if (!Objects.equals(currency, document.currency)) return false;
        if (!Objects.equals(amount, document.amount)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(symbolAmounts, document.symbolAmounts)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(cashQuantities, document.cashQuantities)) return false;
        if (!Objects.equals(commissionAccount, document.commissionAccount))
            return false;
        if (!Objects.equals(budget, document.budget)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(budgetAmounts, document.budgetAmounts)) return false;
        if (!Objects.equals(classifier, document.classifier)) return false;
        if (!Objects.equals(noteFromBank, document.noteFromBank))
            return false;
        if (!Objects.equals(cancelRequest, document.cancelRequest))
            return false;
        return Objects.equals(cancelReqInProgress, document.cancelReqInProgress);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + edocRefId;
        result = 31 * result + (globalId != null ? globalId.hashCode() : 0);
        result = 31 * result + typeId;
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (documentNumber != null ? documentNumber.hashCode() : 0);
        result = 31 * result + (documentDate != null ? documentDate.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (read != null ? read.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(checkResults);
        result = 31 * result + (sellingPoint != null ? sellingPoint.hashCode() : 0);
        result = 31 * result + (identityDocument != null ? identityDocument.hashCode() : 0);
        result = 31 * result + (clientExternalIds != null ? clientExternalIds.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (operBranch != null ? operBranch.hashCode() : 0);
        result = 31 * result + (operationDate != null ? operationDate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(symbolAmounts);
        result = 31 * result + Arrays.hashCode(cashQuantities);
        result = 31 * result + (commissionAccount != null ? commissionAccount.hashCode() : 0);
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(budgetAmounts);
        result = 31 * result + (classifier != null ? classifier.hashCode() : 0);
        result = 31 * result + (noteFromBank != null ? noteFromBank.hashCode() : 0);
        result = 31 * result + (cancelRequest != null ? cancelRequest.hashCode() : 0);
        result = 31 * result + (cancelReqInProgress != null ? cancelReqInProgress.hashCode() : 0);
        return result;
    }
}
