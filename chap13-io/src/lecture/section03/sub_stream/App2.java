package lecture.section03.sub_stream;

import lecture.section03.sub_stream.dto.MemberDTO;

import java.io.*;

public class App2 {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();

        member.setAge(28);
        member.setEmail("test@test.com");
        member.setGender('남');
        member.setId("admin");
        member.setName("어드민");
        member.setPoint(3.14);
        member.setPwd("test1234");


        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong777@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "korea31@ohgiraffers.com", 16, '여', 1221.6),
                new MemberDTO("user03", "pass03", "이순신", "leesoonsin@ohgiraffers.com", 22, '남', 1234.6)};

        try(
                FileOutputStream fos = new FileOutputStream("src/lecture/section03/sub_stream/object.dat");
                BufferedOutputStream bos = new BufferedOutputStream(fos); // 기본 스트림 객체를 생성자에 전달
                ObjectOutputStream oos = new ObjectOutputStream(bos);     // 기본 스트림 + 버퍼 스트림 객체를 생성자에 전달
                ) {
            for(MemberDTO dto : outputMembers) {
                oos.writeObject(dto);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        MemberDTO[] inputMembers = new MemberDTO[3];
        try(
                FileInputStream fis = new FileInputStream("src/lecture/section03/sub_stream/object.dat");
                BufferedInputStream bis = new BufferedInputStream(fis); // 기본 스트림 객체를 생성자에 전달
                ObjectInputStream ois = new ObjectInputStream(bis);     // 기본 스트림 + 버퍼 스트림 객체를 생성자에 전달
        ) {

            for (int i = 0; i < inputMembers.length; i++) {
                inputMembers[i] = (MemberDTO) ois.readObject();
                System.out.println(inputMembers[i]);
            }

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}