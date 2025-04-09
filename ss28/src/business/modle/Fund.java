package business.modle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Fund {
    private int senderAccountId;
    private String senderName;
    private int receiverAccountId;
    private String receiverName;
    private BigDecimal amount;
    private LocalDateTime transferTime;
    private String inputData;
    public Fund() {
    }

    public Fund(int senderAccountId, String senderName, int receiverAccountId, String receiverName,
                BigDecimal amount, LocalDateTime transferTime, String inputData) {
        this.senderAccountId = senderAccountId;
        this.senderName = senderName;
        this.receiverAccountId = receiverAccountId;
        this.receiverName = receiverName;
        this.amount = amount;
        this.transferTime = transferTime;
        this.inputData = inputData;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID tài khoản người gửi: ");
        this.senderAccountId = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên người gửi: ");
        this.senderName = scanner.nextLine();

        System.out.print("Nhập ID tài khoản người nhận: ");
        this.receiverAccountId = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên người nhận: ");
        this.receiverName = scanner.nextLine();

        System.out.print("Nhập số tiền chuyển: ");
        this.amount = new BigDecimal(scanner.nextLine());

        System.out.print("Nhập ghi chú chuyển khoản (nếu có): ");
        this.inputData = scanner.nextLine();

        this.transferTime = LocalDateTime.now();
    }
    public int getSenderAccountId() {
        return senderAccountId;
    }

    public void setSenderAccountId(int senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public int getReceiverAccountId() {
        return receiverAccountId;
    }

    public void setReceiverAccountId(int receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(LocalDateTime transferTime) {
        this.transferTime = transferTime;
    }

    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }

    @Override
    public String toString() {
        return "Fund {" +
                "\n  ID người gửi       = " + senderAccountId +
                "\n  Tên người gửi      = '" + senderName + '\'' +
                "\n  ID người nhận      = " + receiverAccountId +
                "\n  Tên người nhận     = '" + receiverName + '\'' +
                "\n  Số tiền chuyển     = " + amount +
                "\n  Thời gian chuyển   = " + transferTime +
                "\n  Ghi chú            = '" + inputData + '\'' +
                "\n}";
    }
}

