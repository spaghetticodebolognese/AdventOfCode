import java.util.HashMap;

public class Day01 {
    public static void main(String[] args) {

        /*
        --- Day 1: Trebuchet?! ---

Something is wrong with global snow production, and you've been selected to take a look.
The Elves have even given you a map; on it, they've used stars to mark the top fifty locations that are likely to be having problems.
You've been doing this long enough to know that to restore snow operations,
you need to check all fifty stars by December 25th.
Collect stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar;
the second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!
You try to ask why they can't just use a weather machine ("not powerful enough") and where they're even
sending you ("the sky") and why your map looks mostly blank ("you sure ask a lot of questions") and hang
on did you just say the sky ("of course, where do you think snow comes from") when you realize that the
Elves are already loading you into a trebuchet ("please hold still, we need to strap you in").
As they're making the final adjustments, they discover that their calibration document (your puzzle input)
has been amended by a very young Elf who was apparently just excited to show off her art skills.
Consequently, the Elves are having trouble reading the values on the document.
The newly-improved calibration document consists of lines of text; each line originally contained a
specific calibration value that the Elves now need to recover.
On each line, the calibration value can be found by combining the first digit and the last digit (in that order) to form a single two-digit number.

For example:

1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet

In this example, the calibration values of these four lines are 12, 38, 15, and 77. Adding these together produces 142.
Consider your entire calibration document. What is the sum of all of the calibration values?

--- Part Two ---

Your calculation isn't quite right. It looks like some of the digits are actually spelled out with letters:
one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".

Equipped with this new information, you now need to find the real first and last digit on each line. For example:
two1nine
eightwothree
abcone2threexyz
xtwone3four
4nineeightseven2
zoneight234
7pqrstsixteen
In this example, the calibration values are 29, 83, 13, 24, 42, 14, and 76. Adding these together produces 281.

         */


        String input = "eighttkbtzjz6nineeight\n" +
                "5knjbxgvhktvfcq89onefive\n" +
                "hnjcrxeightonejnlvm4hstmcsevensix\n" +
                "trsdgcxcseven39dpmzs\n" +
                "oneninesixtwo26\n" +
                "dppthreeh32twobhrqzks\n" +
                "1cxklgfbvhsnccfive4\n" +
                "foursgjsevenseven5five19\n" +
                "nrrk87\n" +
                "63ntkjbvcv3ntdcptmvheight78\n" +
                "7xv3one\n" +
                "3tzjcrfbvhtqctfmqmdcbjhxln9eightnqbcqztmxcthree\n" +
                "sevensszlgdrlrhnptonethree3qvrxkbgfxtthree\n" +
                "3nckzkpkjsvztqkgvm99\n" +
                "fourthreeonesevencqdv2gnvblhr\n" +
                "528ksdcbx\n" +
                "six342\n" +
                "3twozrfrtljql9eightgcqrgmbzz7dlcr5\n" +
                "6five2threesevenone65\n" +
                "4onejrg23sevensxfive\n" +
                "fourthreecszzvhzfsevensix916\n" +
                "spqzvdxxjeightninejzbpzone7\n" +
                "cfivesevensix332lfpcffmld\n" +
                "ninesevenhrdvmzj24bcxxz6\n" +
                "khpn3fourvhqmntjxfhsvrlnvc\n" +
                "bfzxhzftwo2czsrv\n" +
                "mmblpnnineseven4gtfvqscghfour\n" +
                "1zjgqlz\n" +
                "five1ninetjjtfxqpdkgrxtgxrcsevenkfdzlh\n" +
                "s8twoned\n" +
                "8fiveone53nineeightthree7\n" +
                "926xrfcjzvpd7\n" +
                "3sevenqnzjsqh6fnssjdsbv3nine\n" +
                "rjbbsevenvzkghzsixsbjchs59\n" +
                "221fsnxtbstone1\n" +
                "seven9fourpdseven1four2eight\n" +
                "two1nine4nine7\n" +
                "9seven7\n" +
                "fourcjmdgjsfive2l\n" +
                "twokvhrdldggn15twoxfivenine\n" +
                "mmjtldgmvq157hchsnvpbjvrvtvnineeight\n" +
                "cgzeight3sjmhdcvlnthree5vkgfmx\n" +
                "8sevenfourgnxdpp62xx5\n" +
                "jgdk3z7mmkkjkm\n" +
                "9xrdltttpqznsljbvcdvtz\n" +
                "62zthreethree6\n" +
                "sjbxq9ptsvjhpzmxfoureightmdbnlsckfqlqr\n" +
                "91xrnsbxxsvk6brxfftpttsevencszfhsnrfive\n" +
                "two9ljdfskpfive\n" +
                "1seven384\n" +
                "xbfkhfvlts8dhtnxhxgn93three7one1\n" +
                "3xkjrnqnqhgcfgjvfmxhghp15\n" +
                "nine9844\n" +
                "5onepczqjfcgfrbmtstbqbktphkvqcmbbvhpld\n" +
                "eightsixhnsbnine1twonevrs\n" +
                "eightcmbm2zbxsixone34\n" +
                "five99qccjbklfivevqskhpxzd\n" +
                "seven9four2kzkjbrp\n" +
                "ttdbhd4gqzdlqldnm\n" +
                "9cqcztfourrsfskdjf\n" +
                "njttzmcrchfd4\n" +
                "r414tzqnfddrbf\n" +
                "4tzbfcjksjsn7eightonelvkjzkch\n" +
                "ls7four\n" +
                "6eightsixrtkcrcbmqq6eight3nine\n" +
                "onesix5five7six1\n" +
                "dvrqseven5ninegqthree4two9\n" +
                "fourgdkmbrlgc8\n" +
                "three7nine\n" +
                "sixqrpzqvxd7xnbkftn5seven\n" +
                "oneonerbpgk5ljpqh5threevtpkpfxtsv2\n" +
                "ljttxthreefour3three4gxzgsfm\n" +
                "sixttjvhdggbk357\n" +
                "eightlb4\n" +
                "fourtwo4twonekzb\n" +
                "8one2cdsnrbfxbsixztcfour1\n" +
                "ldveight19lg\n" +
                "seventpd84dscfmxj\n" +
                "one34flpg6eight76\n" +
                "cfninepkscscc5\n" +
                "flqv5v6twooneprlprlkcbk\n" +
                "qsqlrvmkq5457ninetwosevenm\n" +
                "xlvvtxgspct4gmrgeight\n" +
                "hpbbkqthree4gzbq768five\n" +
                "5dqfsixeightonenine\n" +
                "seven4nfshmhvgqm4\n" +
                "rhfgvzxtfckbtmxtt9rqms9one\n" +
                "3gsgfbrnkhqrjddvlx59four2jfz\n" +
                "fdl4two\n" +
                "9sevennine158\n" +
                "five9eight49\n" +
                "3mfsixnkxdbpdxqdgfdqnk\n" +
                "six9fivefive\n" +
                "fourjdmvlvkrp5seventhreejnqncmktwonev\n" +
                "8cjfqkkgtzlnine\n" +
                "3nnsevenjdbjfp1\n" +
                "ghthree1mhgtklfqdkqthree7seven4\n" +
                "4mqsstftj\n" +
                "sixprblqsevendsxvqnk5\n" +
                "four45one\n" +
                "dxhvj23188xz4\n" +
                "dcmnr2\n" +
                "xfoneightsixnine6fiveseven\n" +
                "6cxbbxkrxphsix\n" +
                "5ckkzlzjngvssfx\n" +
                "223zgb\n" +
                "six4qsf\n" +
                "hfxgsfhfhpjlvb329eightone\n" +
                "9zjkckhxoneightbnj\n" +
                "xsdp23seven3four7\n" +
                "8five53eightthreenljbtgcnfive\n" +
                "fnjn36\n" +
                "eightkpkxrvssix2lhctc\n" +
                "6ninebqcksevensevenhk\n" +
                "2one98rrtlncrxhllbgthreelgvkdf\n" +
                "sixzdnlfrvvd4\n" +
                "lltjs8sixqbblmfdhctwo\n" +
                "6twonclq98sscjn\n" +
                "six3niners7eightwokjj\n" +
                "sixeighttwo1onerxrvvbfxxqmxnq9\n" +
                "conetfpbsrm81sixsgkfqk8six\n" +
                "jbqs5277\n" +
                "kjbncjlqthxzlznld89bgqgkxfzpqsptwo\n" +
                "onefive1\n" +
                "pchlnspk52one4sgqj\n" +
                "zd3\n" +
                "43fsfplhgxtjthree7gs4npllqvll\n" +
                "eight8sixeightone6onexr\n" +
                "six6hqltskzpkgbggjktlzlpktdqhzdbnine9\n" +
                "eightnpfbmfninevgpjsleightxh3mz\n" +
                "rninenine7nine\n" +
                "fourbbjnjrbzdvshfeight62\n" +
                "3hzpfsfsdm\n" +
                "2vzhjbv6\n" +
                "27bpninejhbcjrmz7zfqf4\n" +
                "ppflreightpmztvhvonetnjmrxdd31one\n" +
                "threeseven7\n" +
                "srf5hcxvhsmn5five\n" +
                "onersvqvqgkfiveeightqxgrjgfcqj5ntgdzxp3zxdcmbsjqn\n" +
                "mcb643fivetwo\n" +
                "onermbkvmkc9pfvlpdhkzj\n" +
                "3oneeight64\n" +
                "qtnptg5two36nine2tprkbtb\n" +
                "15lbhtcqfnj1qgjk\n" +
                "eightkzrnlrrnlltdmxlbxfourpbpghtgkb9nvlvsm\n" +
                "26kmmkz\n" +
                "jhnldxdtpseven46oneightnb\n" +
                "4lfftjtbzvppxsix17nxpgvjkxd\n" +
                "vszsbxdzjfourhlxldrthdzpqg6slnj8four\n" +
                "nineone2njsfpcb\n" +
                "5sevenone6five\n" +
                "jrmdhdvrb53onelgvlkd29seven\n" +
                "qqqg7eightseven\n" +
                "sevenm9\n" +
                "3dfcfcdb9twoqbvxjgt56six\n" +
                "xq88jjmv83pspctxthree\n" +
                "38five5\n" +
                "six7rbrvjb\n" +
                "eightlvqn335nine\n" +
                "rgmfflzxzd9hs3foureight5\n" +
                "qm6qvmrone4\n" +
                "fournine8\n" +
                "two688qqdtdfbmzn5\n" +
                "8joneonefourljvbjntkngtskcgfnszpgxt\n" +
                "ninethree5pjzcvntl984five\n" +
                "mfgqzcjbglx7\n" +
                "ninemxnfcqrbjonek1nineggj\n" +
                "8dcfkfdtwo\n" +
                "4cltttbrlzpgzbdbqsevendtwosspqk\n" +
                "8eight9klmcbninetwozdcznsv\n" +
                "six85pjqldfbqvclntpnqgv\n" +
                "1dgprzx53\n" +
                "4sixthreeh3fjqpggtjzq\n" +
                "fourone8fiveseven4kgbs7\n" +
                "seven64npxthreeonefour\n" +
                "xvntvgxv9twotlgcsbgsix4\n" +
                "hcqtdzthfour2xvqmnmgrncjt51\n" +
                "qhlpksvnntjq8\n" +
                "3rtmfngqccktwovpppqfqdlxmk2\n" +
                "sixfoureight9tqpdln3eightbjnqfldblnine\n" +
                "eight2sixthree\n" +
                "3plpm\n" +
                "6two3two2\n" +
                "1cfszpnxgtk5fivefive8one\n" +
                "lxrdvls2\n" +
                "sevenfqszrfhone5dxcqsq\n" +
                "42\n" +
                "3dmpsix9nhgzhbmknfour19oneightlng\n" +
                "six2dfglxszbjone\n" +
                "eightone88\n" +
                "9hffzxl7five4\n" +
                "seven8fknjk\n" +
                "fivefoursevenllljzrvjf7\n" +
                "eightmsxfkbszh2\n" +
                "6fiveqhkttbsthreefghn4\n" +
                "3eight98vsnzbkvzcjfive\n" +
                "spmzsdztzgcfbhvbzqlv5\n" +
                "fourtwozlsst9sevenjjmbmqk4\n" +
                "jtmlgrjcpkone2twockgc5four\n" +
                "one35five4\n" +
                "four8tltpxqfour\n" +
                "57sevenbmhceightbhttrzxfvt\n" +
                "qlvrrlnxgvjgnine1four2two\n" +
                "sixoneseven3sevenm\n" +
                "fivejxfghfp81two\n" +
                "rkp3zbzfnrrqfour4eight\n" +
                "eightnine7tpflkbqpz\n" +
                "28fourlmxlhdzctxkrsix\n" +
                "2fiveeightnineninexhfourseven7\n" +
                "mnlrszkr18tfive7l\n" +
                "3eight639\n" +
                "gqpbkntddpeight22lxqjqqone\n" +
                "txxrdbx4bvsfxd\n" +
                "343nsctfvndmp93four2\n" +
                "9lqjvtjcrrtthree\n" +
                "bsffrmtwo2fivesix\n" +
                "qltdtgl3eighttwo91mjq\n" +
                "rh4rddsfr\n" +
                "fourfive7seven\n" +
                "pbqmx7twoqdk\n" +
                "6onesixclklzfzsq992\n" +
                "kzxkxvqzjffourdtm4onefive6xoneightsnl\n" +
                "k4snine4three39\n" +
                "sevenone2xcnscqhcdplnonekcxmgt\n" +
                "seven7ninepmeighthqr8\n" +
                "xpspdx3twoqpc3881\n" +
                "5two5four8eightfive\n" +
                "sevenseven2bcbsf\n" +
                "1sevenrjstpdxfiveseven\n" +
                "2zsxfivefivesix43\n" +
                "eightone5j99nhvbfqhzbvrv5\n" +
                "onefive35m\n" +
                "2kfnqftkkcxtskj\n" +
                "twoeight8\n" +
                "1one8bzzsmgvj2kmqcnqjrz4\n" +
                "1one4sixsixbzbcglm\n" +
                "fiveqqhbmnjgz5ninerlrxkl2seven\n" +
                "4eight4two1xgkb91fdzgxlp\n" +
                "nine8onefive5scxlfrf\n" +
                "gbrqllhnine9\n" +
                "1fouronesixfiveseven95\n" +
                "7qjrprpseightshfzfxvn\n" +
                "2vkbbxfrthreenineeight\n" +
                "58three4\n" +
                "lmfsgdzxnqfdbxtjsnp9\n" +
                "zlbqglfseventprsqvsmt1one9\n" +
                "fmksmtlc8dvhbtdvpfgdz\n" +
                "3six1\n" +
                "mkdthree67jkprftqhdzvjxxftthree8\n" +
                "bstlpptcfghsrrnine7bz\n" +
                "5m1qfscxncvkqgtf\n" +
                "62four16threeoneightg\n" +
                "twoxlrhpc8n9nine\n" +
                "q5sixfour\n" +
                "ninesix2ninepzvxxlpcbxsfpz28hxtccfzmdq\n" +
                "sevenccq4npgpkkb\n" +
                "k79four9fp\n" +
                "ssqptjqvld1pjfdjnkvsevenkjdzks\n" +
                "2bgpbgqfournine614\n" +
                "16threeeightwot\n" +
                "five68jnhzdfqp2qlqbmnjmjdtfbj\n" +
                "vplnzg4545seven\n" +
                "two3two\n" +
                "zcbhzsvc68cnppjpqhfl5\n" +
                "nine68seventwo8pfzgfzbsh\n" +
                "onethreethreeknngnmzhpmlnsd7\n" +
                "46two\n" +
                "sixhdg748blmlkbdtjbtwobgpzzlhzqrbvl\n" +
                "2smcthmql84seveneighthnmdkmfg\n" +
                "5fourrpscd3\n" +
                "sppzzjbckgsixone1sixfour\n" +
                "ltkzb3v3ltwo\n" +
                "four61nineeightdkgtcjfvds\n" +
                "eightd5nfcvvdxhkkddhb\n" +
                "four6q7thbpnz\n" +
                "5rknhshlhgnzz7sixone1six\n" +
                "327rkthreesixeight\n" +
                "cnbqtvptwo1qnsevenpzqh\n" +
                "threeqthreepmhgcqhseven2sevenggmpjcldz\n" +
                "ninedlvlgnglqf3\n" +
                "4two993ninetwo\n" +
                "eightzpfournine72oneseven7\n" +
                "ninejdfkznz62kflbvgpblcgchpzz\n" +
                "448\n" +
                "6rktvxxjpfpqtntbsonefive\n" +
                "6lngttwodshgtworkvvsrnfhjmvpvvbseven\n" +
                "eight43gpssneight\n" +
                "6seven3threefourninesevenrnxx\n" +
                "three22rblfvqjr1four5six6\n" +
                "xtdsqqbv43cxxvfpvtwoklhnqgjlkrrg\n" +
                "threevpvxgddmhl576\n" +
                "3cxccdsevenmvzhqvpfn3btldbhbmfg\n" +
                "kklcmgptl931threenineeight\n" +
                "vj42ntvkrcjtq7sk6\n" +
                "llsvqthreefive5\n" +
                "xspgshknq3kpld2lfour6mhzrzvqf\n" +
                "4bfl38onesix9\n" +
                "seven1vjzjmcrrvnh\n" +
                "7sixsevensix\n" +
                "gqnkgzmvpsnnzcvldlftrzhnpcbq6hzvbqbmnqvsix\n" +
                "5jvbldxsh\n" +
                "jrmvplfive7mfpbsmklzfivefivelsm\n" +
                "8seven5nppxjfjsevenbxrmzmdjnine\n" +
                "seveneightnrkconeqgjfkxjr532\n" +
                "m9seven7\n" +
                "vdn5hdghzvphfour\n" +
                "cpceightwo3\n" +
                "sixtdxhninesevenmmzrpdqcp24\n" +
                "tghjrkhltwojgrcnnbbq1\n" +
                "cfrqlvsevengkthnsbtwo4twovffpv5six\n" +
                "two6pcxj4eightgbctk71\n" +
                "five93nrqpshmxpbdnzssb2\n" +
                "jnxjdzm2xcfhnzkxxz948twonejv\n" +
                "sixfive4four5nkdxzvd\n" +
                "twoqvnxzgcg883fivejgvltjq4\n" +
                "7mzsqvrxlf6kpfjgvdpvj\n" +
                "tzhkjn813six7\n" +
                "5qjbtklseven\n" +
                "rddmfnjgdlnkx5fourzkxlttqdfourrrjfdd\n" +
                "qtr2qrrqvhrkvmtqgbkdq\n" +
                "five56ninesschfzxone\n" +
                "lkb3\n" +
                "3zmbbqdqqnineeightlvlfqqxleighttloneightv\n" +
                "7threetwofive168\n" +
                "njxgnsqcpnine2\n" +
                "zthreerfnvvone7\n" +
                "three4one8\n" +
                "8ppmjj983seveneight9\n" +
                "p4\n" +
                "8tshsgmkb516three6four\n" +
                "7seven8\n" +
                "twosixthreenine6three\n" +
                "gvqz9\n" +
                "n89ninethreesix8\n" +
                "ptqrhhvztxsjbxfour81lncqpkjt\n" +
                "8flvhqljqpmlf6fivenine28\n" +
                "zhbsl7seightwoczd\n" +
                "four1pspgxdvtbzdcd7vsbkzmt\n" +
                "fourj9sdnqtwotwonine3ftzrbzckqk\n" +
                "1fourkkfnndsdxnklrl\n" +
                "zpcdvrszc4ggjcpngkqeight\n" +
                "6twonxhgzcsrgxtwosixvblddxgfmsmqtfcthree\n" +
                "6pltsptthreefive5jjqtzncslmxrmbv7\n" +
                "sixfourqfxtfour9onefivehsgdvpmdsfive\n" +
                "ksevensevenonebdxdxffive5threeeight\n" +
                "zztvdjzlnqtbrfccctsknppmx5seventhree9\n" +
                "soneight716\n" +
                "1fqnntfjhcj2threekmcpzqnbzlqps\n" +
                "twopcftkx8twofourcsixfour\n" +
                "8six2sixgxzzhpkv\n" +
                "four9nine4tgq\n" +
                "htfmtchrx634four5zsmkmdv\n" +
                "45dltlvdvv\n" +
                "dtl848three36\n" +
                "nine7sixonetwo8vsix\n" +
                "twobxctmqvdnt96mnljbpxtsptjpznrjctgtwooneightqv\n" +
                "peightwosixeightseven4\n" +
                "1seven8ds4five6pone\n" +
                "zjftdkvpkpfrhzj97nine56\n" +
                "4sdcdr53beightwocjc\n" +
                "onezxmtfive7ttbbttjeighttwo\n" +
                "rlcjone3sixonezvbmzcgpk4eightwotnm\n" +
                "5ddmcsfzhntpnzntlllthreevqvct\n" +
                "twoeight9\n" +
                "tfhmxsbf2foursqrrfourmfrzjffive6\n" +
                "dhhnlbkjmfourthree6\n" +
                "dxtkbxjlphpqcbmhpdfpqlmreight775bh\n" +
                "sixklvmtjgsevennine33qgvplfourb\n" +
                "gkjmcxsmhtwopkcszlrjd1onesevenseven\n" +
                "8xxvzzqvzszcn1onevmdfsrrtbbjgeighttgpmhh\n" +
                "eightpndprhrf7\n" +
                "three7fpxtxghx\n" +
                "fivenssevengrrlntzldl87\n" +
                "484sixjsxcmmtvbftrfive\n" +
                "t8onesevenvqsfc2k\n" +
                "sevenoneoneeightsevenfive71\n" +
                "sevennvnvbtzsnqggrsrgq35sevenfive7\n" +
                "feightfive12\n" +
                "twoc846cf\n" +
                "1mtvlxhhxlsdbphgltlgzpl\n" +
                "xddrlslrdl9\n" +
                "fiveqvfjvcqlcfour27\n" +
                "9fjqp9rrkqbtpv3\n" +
                "23fqccxsvsix94tkzsqmrhsg\n" +
                "6lvrsqnz\n" +
                "9four7hvlfl9\n" +
                "gbgsnmkrxjxpgnj828\n" +
                "56grzmb6onekf9six\n" +
                "87bjn4\n" +
                "sjdzmqkrlkbsmxzsmn3\n" +
                "seven91eightsix\n" +
                "svhfnxzdzqczc2\n" +
                "vbnz92chjjfqftxfourqzzxseven\n" +
                "seventwofour5jbqvlmqknbznfbhtonefour\n" +
                "dqdmntkfsnbmjqxxgmkvm6vqpgpnnreight\n" +
                "one1431\n" +
                "1five4\n" +
                "twoone8thtxlrrdxbone\n" +
                "qftpltmjd1zpxckthreeeight\n" +
                "9xg\n" +
                "pjpdjrkltnrkkmd9five75rdctppdhjtghrffczdx\n" +
                "mtvbhnpzjfive7nine\n" +
                "thlzdgxcqvsknczrdslsh7\n" +
                "eighteight4kkt7four5\n" +
                "71ninekzfntxtjthreeone3\n" +
                "gzseven2fssqrgmbj\n" +
                "52j\n" +
                "nsv16seven\n" +
                "stwone1\n" +
                "twodbqgfivegsrrvxvone3\n" +
                "jckhqbdlvgbgn7vtx3vggrdm\n" +
                "ntzftfhfeighteight2\n" +
                "48eight6\n" +
                "flzfqonezvskbf1668one6\n" +
                "sevensix864eightfour3\n" +
                "dnsdrsxvcxnsevengxrszqxfnd4fmnine\n" +
                "tjjngfourhdfzpfkh24\n" +
                "foursmgvlqjxsqmz8ninekthktdhz\n" +
                "three435\n" +
                "tkfqhpz8zjmcqbxcb46\n" +
                "mmvstlmln3kxnkvjcmxtrdxp4seven\n" +
                "rmfour13vkgnnmbzbzgd\n" +
                "three6nnbljchmzthreeg\n" +
                "68onep9five1one2\n" +
                "rbvzvgmkbmdrnmvone7kqtxtrtbone\n" +
                "three13six4\n" +
                "qksfrmvgztsfournnvp66nine\n" +
                "34three\n" +
                "11fourpzkmqnfmjqkdgrlgqbsixsixcqtgdggbdx\n" +
                "nineone2seven4twoninesix\n" +
                "ninez6qpnnbpmcdhcr\n" +
                "sixbdbkhgntpsevencpn3\n" +
                "1fivehvlrzpninemkfbfgtvfivesix3\n" +
                "7kpeightzlvqsgkfjznpfpfsseven66\n" +
                "c7hxrgkglfivebfctxk\n" +
                "5rfdxgshzmnzqscpqzlbnrhbg9strxdthree8kntkhdpdll\n" +
                "4gfzcjcjsm63fvxpvflv\n" +
                "nine8526\n" +
                "6scslfpnrveight1seven5bdllknjj\n" +
                "seven94hnxddjv26s\n" +
                "two48seven3four58four\n" +
                "fourseven1smh5\n" +
                "1zzdzmbjpjfzlhsvzgxf61gvtnklgx6\n" +
                "ninefour63\n" +
                "nine3nrfzn\n" +
                "gthreeseventwonine1eights\n" +
                "sdonejzdmtxtpl9onerzztvqr8\n" +
                "eight15kqnjrggpblhsbdz1\n" +
                "lkkxnzjrgsixsixthreeeighteight4twonem\n" +
                "d17two44\n" +
                "6seveneight1fourthreesevenbdpvg\n" +
                "cjgchvhq4386five8\n" +
                "1threefive426rsxmthree8\n" +
                "sixnztppjtn9twossfjrdkzkrldztfbbv\n" +
                "threesevenlqrdmvzdcphmqj3four5three\n" +
                "fivethreepcfxdxmc3vdbprghd5sevenszprlbzrbn\n" +
                "threethree88xcgdmrcssevenrlflv39\n" +
                "eightonezchscllpfone9\n" +
                "zreight6sevennine\n" +
                "fmrhqrxr7\n" +
                "sixnlqccjchpxpqg86five5\n" +
                "sdpxjrxtk4sevenfivetmddbpqgtqffive2\n" +
                "hrvrgjgvxt7vrsr\n" +
                "2zj8\n" +
                "35fourspthreeseven3zgddrmbxmsz\n" +
                "four8kkxmtsscf\n" +
                "4six98\n" +
                "five9four\n" +
                "four5one7pjbninefourbmss\n" +
                "4sixsixt138seven\n" +
                "fourxsevenseveneighthsgmmpdx5\n" +
                "tonexhgcjxbjn8\n" +
                "chbkd2183\n" +
                "six8fivefourglszgngfgqthree\n" +
                "pghkzrftwo6\n" +
                "fourpfx572\n" +
                "62zfvzp\n" +
                "sixsixnzvtxdgsixzxsgmpz1zvtwo4oneightpg\n" +
                "425twothreebv4twoxbx\n" +
                "8nineeight55eightflkpggltsr4spl\n" +
                "seven45clkrkrxj\n" +
                "65six594twofive\n" +
                "4ktvpfjeight\n" +
                "nnslpmkqc5five5four\n" +
                "nineonetzmft8jcxqzrk\n" +
                "fivefivethree99\n" +
                "2l2\n" +
                "4mhdj\n" +
                "3eight7fivejqhvrszgh3\n" +
                "5four7mbfz8\n" +
                "one8sevenmltbgqcbq22\n" +
                "1zgfnfvt9seven\n" +
                "2lhbfrndhmfiveone\n" +
                "fivekzgch424zbpgxhtkbjdljxkxvnz\n" +
                "1vd6vpmzjmnhhn\n" +
                "vlqcbhskb5onerqbql6\n" +
                "six3tplqcxthreethreefoureightzldgvgxrthree\n" +
                "4fourtwo4\n" +
                "cvznvxbxlszjpxvzbqn7gt2fjtxddzmjv\n" +
                "kjqthree67twosixfour4nine\n" +
                "dmjrhflfzslhkjmthreemfgqvzcpm9bcnfbpz\n" +
                "nfpcsevenone3two58\n" +
                "eight4kdqczz96five1four\n" +
                "1mzfour\n" +
                "57tdcmtmns4\n" +
                "bdxeightrjvkrddrm3nftmzxlftthree\n" +
                "2three2kvfourgrtvxmrzgdninecseven\n" +
                "threemxpfnthree5onehjdxfntvtzlxhr\n" +
                "8onelqtjpkmtwotwoseven91\n" +
                "rzhzg1fouronecqkdpfkgdkkftsixhllvphvtjv\n" +
                "vxgrlptk48one14two\n" +
                "kqncz3znmkppxs3hlggbmsfj81\n" +
                "ddrp3\n" +
                "three8hjdccgthrtbd6lvhnbfivemzh\n" +
                "twomptzvkqmssix7bjvpsix6nine\n" +
                "phrdjxmzj3xxkmfour7dsix\n" +
                "5threeshtmlsjbmfzgdq\n" +
                "96eight\n" +
                "three6rqqxgzthreejphvs\n" +
                "69seven52kmnpbqmjdhtjvxcnlxfgldbs\n" +
                "veightwozbbcmqrdxv6hxxpdknf\n" +
                "nxbtwone1vktdvlbbhnfour\n" +
                "4five864\n" +
                "2dn1fiveeightthree\n" +
                "two4twofoureight43\n" +
                "1eight51\n" +
                "71fourhjrnqssxqvf\n" +
                "sevenqxkccdxndfgqhctsfsx6\n" +
                "xqgsjvdmnb31sixfourtksqshz5\n" +
                "4ghkqfzxceighteight2eightfiveeightwotf\n" +
                "ninelsnldgslfxfqfsrc24six\n" +
                "3seven3ctbf9eightmshd\n" +
                "mbqpfourfive44sixbnmqrmkgxt\n" +
                "flgdrvjj4dks\n" +
                "oneqslfbjgfx8\n" +
                "jmmssm2\n" +
                "hjfbzsix1\n" +
                "bvjdxseven8\n" +
                "fivenhfccvg9\n" +
                "four5sevengkvslppponerhlvfms\n" +
                "b9one\n" +
                "89znlhgbnkmmxsix3two\n" +
                "sixsqtjcdfbs87ninejvznvmeightfvst1\n" +
                "sevenktnzdkcsrzzdqtb9jnbtwotgxsptxcd5\n" +
                "6mqvbhsddnmb21sixskg8\n" +
                "threenb2four74five1lcmdzrvq\n" +
                "ftvone7\n" +
                "5msevenpdqgzncvzxeight\n" +
                "foursixpshnbrpm64\n" +
                "six2twotwordzf\n" +
                "nine7lbnxsfjtbb1seven4ggt4\n" +
                "zlnfkkconept36\n" +
                "9sevenfqlxjmts94xpcxqseven\n" +
                "foursevenseven15ninedqff1kmzfgvnks\n" +
                "xktjdhb115\n" +
                "threeeightcnlpzrb8\n" +
                "91six\n" +
                "376kkgmlblrcbthree7jgxvgfcdv\n" +
                "9xpz3\n" +
                "rrcvpkgtwo2one6vjfone24\n" +
                "sevenhfour3three\n" +
                "pxfvzltqrg9twotwogqdtzbp\n" +
                "lrgseveneight5pmxvppjdhtwoone\n" +
                "97six\n" +
                "four8bjdhpmszdeightprkgone\n" +
                "mb6lfcdkcn\n" +
                "8fbvxnjone\n" +
                "z9vdthreethreesbsrkzgnsxp8\n" +
                "sevengftjmm1onegqhpninesnr3\n" +
                "f4fourrbbngrdm37five\n" +
                "ninerbmdqfvkfx9eightone8eight2\n" +
                "rxdvclfr714\n" +
                "oneggchmt2dgh7\n" +
                "tvbfour9four\n" +
                "four474fourgmdtm\n" +
                "nffourpbxtlcs7ninethree3\n" +
                "bpjlrztwo2sdttcghc\n" +
                "hfflhmdc18\n" +
                "4ninepsrmtbqrfeightk3xxxf\n" +
                "433hdvcggkr1xjcntvtnvsc\n" +
                "7nine2nine6\n" +
                "9zctwo\n" +
                "9vvfjvctgtzpjh7jtdjcrh\n" +
                "qrtgcd5six31khd5\n" +
                "fourbjshrq845zg\n" +
                "ghconeight35jljdqgtg4fjdtxtsfiveone4\n" +
                "one7kxscgcxnsx\n" +
                "43threethree54four\n" +
                "vmninetwo2onetqgblrsgcpfkrreightwokg\n" +
                "threefour38\n" +
                "fivesixeights26three\n" +
                "jtmzzxvmxone2four9jgtxjrvpcthree\n" +
                "fdqgczkq8sevenvcnhpseven8three88\n" +
                "7ninezone3\n" +
                "frj4eighttwobgx1threesjckzsvvxlone\n" +
                "oneseven2cspzhqfsix4\n" +
                "ljmnbbcnxffkmdn5\n" +
                "tmzlnl8oneseven86ninelbrzjgqn\n" +
                "fthree3seven6sixtwo34\n" +
                "6two8fivexteight\n" +
                "89seven5twosix63\n" +
                "63pzsjcjzvbhseven\n" +
                "msqvppsgnfbjrjmdrrhbfxrjqdlkpfourjbrjks3dthree\n" +
                "eight6twoklkdfgvxzteighttctqz\n" +
                "4gjpfmqs233six\n" +
                "onefourninenxcnkgfour8rmmrzln\n" +
                "1sptlpstqb6eightqgfhzzgpgp24\n" +
                "eightlrjlhqfoureightjvj937\n" +
                "595oneighthpt\n" +
                "44five\n" +
                "two2sevenbtwo\n" +
                "7fivefivepxonebbrlthreefive\n" +
                "klxnlfjlsrgjcd7eightninefive\n" +
                "threeqzpptnzhjnkqfsixpvk3xxlrpl\n" +
                "mqkhsdtbqqzgjb7149ninesix\n" +
                "1dbrrvjsx34cbdxhqpzbfhtgpm9three\n" +
                "3onesix6eight\n" +
                "five34\n" +
                "6qcv9nzngtsjv\n" +
                "9lttthreegttzjstt\n" +
                "four47\n" +
                "95onetwoftdzmhsfmhbnblnine\n" +
                "chcsqhnp72qjdqtjxzc8fourfourfour\n" +
                "fourfive28\n" +
                "81eighttwoqdjkmnleightdbmzz\n" +
                "vzzqpjx8\n" +
                "qq1six\n" +
                "qbktqgrjcqq75\n" +
                "772\n" +
                "njvnhnzdz6threefivetwonelt\n" +
                "pcfzzjfhqkxhfpztpv7\n" +
                "fivemztfourqjrtngrkpcbfc3qq\n" +
                "bfjhbm6ghtdpsmlvb86eight\n" +
                "94883\n" +
                "6onegbxmcqmdfive\n" +
                "sevenonesixcngsrgcz9\n" +
                "sevenzhxktd22fourgnr9\n" +
                "tdxpzvggnlpdxxrcpsp3threexjrldrkmp\n" +
                "34kjtbsxppmxfoursixlbzgqxbltv\n" +
                "fivethreezfive2\n" +
                "7seven1seven\n" +
                "4fhvxbg58eighteightone\n" +
                "631gqtwosix\n" +
                "xqn1chrcjjrqxp4threezjcd\n" +
                "jtssvppxlnsix49rfvjdzntwoone\n" +
                "sevencmpmdnczcfdprgfdbjnzzkgnine26\n" +
                "hkbnggqfk7mfmfsone68sxpdmf\n" +
                "fourtlhsmksvzg4foursixseven\n" +
                "pprkj3sixseven\n" +
                "kzxjpdczxhxckxtgbbtwothreethree5dztmdfrlfivedgcfmmrt\n" +
                "hjvrdhnckspl5eight3three9\n" +
                "74two95eightfourdkzzlkxszm\n" +
                "one7tbfour1cpjtrxsqgvbjtpbcct2\n" +
                "fivefour4hsix8hjsxrmpqqxnkhmjseven\n" +
                "nine8fivehvmnxsfour7four75\n" +
                "sjfrjr2ds\n" +
                "fivefourqt95vbndnzns665\n" +
                "sixssbznthreethree6f8lnzcgpprl\n" +
                "ninepfbpfnflrfnpzhq9\n" +
                "nh9fvrldpkjmq7six5p\n" +
                "75zsixnqbhrcbpmddshjfqthtq\n" +
                "sevennine377fourfrtvpqrseven6\n" +
                "97eightnine\n" +
                "52fiveonetrq5\n" +
                "threehgjqt7rvfsljtzkfour\n" +
                "tjkxc1\n" +
                "jthreerqbpzpzmeightntjlrhdmfour2\n" +
                "fourmgv2three4one\n" +
                "four91\n" +
                "9bone\n" +
                "oneseven1sevenpdvdqhlq\n" +
                "xlhbqxcpfp7\n" +
                "twothreefive43\n" +
                "1ctjmfn9one2\n" +
                "htfivesixcdkjrjbr45eightseven\n" +
                "onefour8rrhltfl897\n" +
                "37ljvmcnjhonevxkqpjk\n" +
                "3891sevencfgjhh45\n" +
                "twoone5tbznkdmv1fourpltvnnsvk19\n" +
                "55bcnzbfggd2\n" +
                "17zpskbgeight2dx3\n" +
                "vbdshtdkxllttwo65\n" +
                "tzvmcmltfphztpplrxjxpbnine3qvktlctfrpxncb\n" +
                "1sixppzlfvkbnm\n" +
                "eight1gdvlzrfkc\n" +
                "four74fivefseven\n" +
                "hlzlvnjrp9312jxeightnine1\n" +
                "sixsevenkjpbz5sevencksb2\n" +
                "9rtvlgdpfnmgzdzcjggsq7sevendxglftncmbninefive\n" +
                "eight8gxkrbkgcvbxbbxlonefivesevenjnffhjsk\n" +
                "99twobdmcnfthreevr\n" +
                "sevenlpjbbthree58\n" +
                "eightthree32\n" +
                "14fhxsqshmjbngrhdzvxvvhxgvqnlxnnvrsgsheightninenine\n" +
                "6twotwo\n" +
                "kr573eightseven78\n" +
                "9six18\n" +
                "2seven8six1qdvf\n" +
                "ones9three1lcqj2\n" +
                "sixbfour6gbd\n" +
                "tfpvtbbjtwormxz6\n" +
                "49eighttwoonesixeighteight\n" +
                "fcrhntggdvseventhreeeight9foureightxjxqvtb\n" +
                "oneone3rnngppxj8fzpsncjmzn\n" +
                "9fiveonejjdpthreetwo9\n" +
                "sixsixjzckvmbbszsl1nrrfphj5\n" +
                "zgjvnttth7sbmtxczggxbbqpzq467\n" +
                "3mhslltk\n" +
                "9six16three79three\n" +
                "fxprlhbm3zljzd49gdsrtt\n" +
                "6eightoneseveneightfourrfive\n" +
                "fourfive11six\n" +
                "6gmrfxnsmnnljf8ninenlctx\n" +
                "seven5threehninecnhbkgbnvqbsfx\n" +
                "pxzccjqz8\n" +
                "xgzpzljnfour7threethrxskjlz9\n" +
                "fourseveneight292eightone\n" +
                "5bjpzjseven21four\n" +
                "xbtf88nine\n" +
                "6nfjllxh4\n" +
                "67five4c8\n" +
                "1qbzdkvmlrzgj3rzqczz4\n" +
                "mjjzblg3\n" +
                "x3five\n" +
                "jrpxsrqgr9hqsddmscmsrsbhkdc63eightxfscd\n" +
                "6eightsixone\n" +
                "5dggfbgclz7htvpcx1\n" +
                "onethree46psdlfpgbsix\n" +
                "lqbnine978\n" +
                "7nrrdzfksbtjlnbgfxttzfourstqkd\n" +
                "mtfptwo9six23hctpbrxtbx\n" +
                "eightfznvmmp7cllpkggknttwoxbbv\n" +
                "rggdrlsgcm2hdljxzjhjrfour83\n" +
                "vhtmhvjdzzkzmzqgr7fourfourfourgzbqqpz\n" +
                "dfjctmlnkqzzjhhltpvhfmhsixvclfive7vgm9\n" +
                "nine642sevenseven9mblrhxxktfhdhbcztvx\n" +
                "4rzrdfmtvlpthree86\n" +
                "qkdoneighttwo1one3\n" +
                "dnnvkvpcmn2cltbzc6five59s\n" +
                "sixsnzpnfplrn38hthhbfive4\n" +
                "tsrxkzfxcdgckxrgzkmrctqvrngfnvdscnpc6jgszldglnhsg\n" +
                "vvtfhtgxjbdgznjjzqjjclfg1lvpdcpjsevenseven3\n" +
                "xrhbrpg8zb8\n" +
                "4nine5qfxlhmvzsjsbznmklseven\n" +
                "lffl2six733jtrfrs3\n" +
                "7nbvpkdpzjtc8qckhbqfsqqgz\n" +
                "cfljnthreecninedt2xldzbgl5six\n" +
                "nrggf7four\n" +
                "hbkpxrxonetwo969fivethreegspmzcfr\n" +
                "jjpmzlzfvqbvbzqcz2eightninepfqjkjrkfivebzcthgrpqx\n" +
                "xsccsbmcninefive4kkrvrht\n" +
                "sgnzzschtwotwofzjt9seven\n" +
                "8tworpzncglnmninenjmf368\n" +
                "2one1zjtgllvsone\n" +
                "7nine4nqqxnvvnsbsevenvddcvfdr\n" +
                "three117\n" +
                "shcjhvrfourpthree12\n" +
                "1zxcxninegpdfrfhzlbzg\n" +
                "7eight9gkkfbdhplnmjkksbqzp6htmbhg\n" +
                "sixeight76sixfive\n" +
                "5twonemt\n" +
                "three86\n" +
                "4three52psgzhnlhgvgcsbzbleight5oneightkj\n" +
                "cnztwone1\n" +
                "six9sgx\n" +
                "79clrpmeightninepkh39\n" +
                "rmfplpsixsixlvrdbqgpljgl5onetwo3\n" +
                "7ninelznqjxjgtwohhk6five\n" +
                "1659two7onefive\n" +
                "rskpnrmfbbghttvklkg773fourczdqeight\n" +
                "xftwo4\n" +
                "2nine5ccrgsmfcseven9seven52\n" +
                "8sixseven\n" +
                "k33threehgqtljcdqxkl\n" +
                "hfgdvngttzfivecflmcc31three\n" +
                "eightninethreensjxxlzhgk9b51x\n" +
                "ninejktfhnnphkkgm2dms5dpxrbcd\n" +
                "eight7skzllgxgmkd1three4thhdpsjtvnq\n" +
                "7ninehhhdngbxjvvxldvbrhzrbvntl2\n" +
                "pxgsixone75llslx\n" +
                "31tgrvtvvlbhnshjfgnqc\n" +
                "knzgkjfckf2sevendfive\n" +
                "bmxcnznineeight9dvkbngzmxz\n" +
                "gzqdjfsxq9pbseven\n" +
                "212\n" +
                "h3\n" +
                "9sixfourbrfsfivekttxzhrmdsppps\n" +
                "3vxtbtrzqzxfhgsksbvqd\n" +
                "9lbxdjmckrhfgjqlnsrrfzqxktqkrmmjshfnine\n" +
                "7pjmmxdcffxgspeightgpdcftjtdxjgdrfthree\n" +
                "t84ninefive4\n" +
                "fgfour63sevendmtrrc9\n" +
                "64three\n" +
                "btjnc3g6f3one\n" +
                "pm9\n" +
                "threefourvjmsx5four\n" +
                "14one2rtcccqc\n" +
                "jhcckpv84xntpzdn\n" +
                "rpjrhgddzfvrzpqnfg5twoseven3threehvcmnkreightwotl\n" +
                "74one\n" +
                "six4ninesnbxlonesix5three\n" +
                "kfxjzjone76xppxgddstgfhxphpffrjlone\n" +
                "sixthreedsdccpqff4\n" +
                "4951\n" +
                "zszgqjxbx7\n" +
                "three4pqqvfzf622\n" +
                "vc77threetd\n" +
                "sixlbglxqhn52\n" +
                "1sgktgvxp\n" +
                "bdsonekxsevenpgssslcq3fgp7\n" +
                "pvnxnhdjmndnhthreefive49\n" +
                "kgvkszsixone4\n" +
                "3mjvqjpglzhphg67ninehnnine\n" +
                "one6xvvnvkxp4dfcxv\n" +
                "eightfour7threesevenp\n" +
                "7ggdl1\n" +
                "ztwonethree427ninetnmzntj4\n" +
                "fttwone258seventwotwo\n" +
                "75sixseven59\n" +
                "7kmfzqgjpqkpdhthjlseven674xdgmphfk\n" +
                "eighttwo6five7\n" +
                "3eightwoxg\n" +
                "22434five\n" +
                "khjmcpzvfpr9\n" +
                "3rrzqzlrljgcvdnxj6four8six\n" +
                "63qrgqklszpgthreefkpzx\n" +
                "574htclbtzfivetwo\n" +
                "jtwofqfpkflzt9\n" +
                "xnjzxpmmdln4lzlmlk41\n" +
                "6jdzjjmz7jt7seven8fourkgttztbsktwoneps\n" +
                "72s166zpslq5\n" +
                "3553lhkdcxvhqbddrfdbc5two\n" +
                "4gktbmone\n" +
                "fouronefives3qhglmzttwoeightone\n" +
                "one87rxkkhfrjfrpdjjt485\n" +
                "one437nine\n" +
                "119one\n" +
                "5lseven87nmxxqvhmn\n" +
                "pphfmcfhxlsevensqdmtvtpvq1\n" +
                "18eightfivefour\n" +
                "three98\n" +
                "4onephzhtq4qc5four\n" +
                "26zglkpjvz3twoeight\n" +
                "7mxkdrbpnk29\n" +
                "ppeight15\n" +
                "9jnprvtmscsixbbpsixfivecktgvdpf5\n" +
                "lbftvcngvkvxf5cmmrqljjb471\n" +
                "eight3knrvtwo\n" +
                "one6pvbpkqkpdsixbv\n" +
                "eight2onethree6eight\n" +
                "5rztcbtfjkb2twoeight39hxppvpxqg\n" +
                "8threemlllncmfourthree\n" +
                "vhtsmncssixbmlpggvmlzdxbczgc1fxrgvsbhsrbs\n" +
                "ninebnpv7575three\n" +
                "4mthree\n" +
                "fourtwo1qrbfourjrjmlxjr\n" +
                "3jbkcsrqznc8\n" +
                "pcgrxgf4eight54\n" +
                "seven5mjk\n" +
                "ninenine6vmcmlxmcrbvq1nine8\n" +
                "sixone2ninesixrdqfgpxddzthreetcheight\n" +
                "899lfbzhgn151\n" +
                "46nineone\n" +
                "7one2qthree\n" +
                "nine2hjnfourninesixvblnqbgctwoeight\n" +
                "qkggsnnthrxnrccbgs583\n" +
                "351zkxqtmbd9sixthreegjjxt\n" +
                "zrchlhmqcthreeninesmxz9\n" +
                "219fivejrxgbjvvcxkjtwoseven\n" +
                "8threebzzsxdx\n" +
                "nine249ninefmlhj8rfour\n" +
                "16zfljhfdcmkthree\n" +
                "7sixjvdqgpvhmndpmhhzsphceight\n" +
                "two2zjqc4nfd6732\n" +
                "41threeseven1fourseven\n" +
                "296fourgnq7three\n" +
                "tbzdhbhs7ntshptcgrbkjspjdz\n" +
                "55qcrmclmcck9\n" +
                "25mhmtb3dscmjbhgv3four\n" +
                "bjmhkxsffourhnxkxv1\n" +
                "jvntlbn5fivegjdcjl\n" +
                "7gndbbbneight\n" +
                "357623chktvtfzvf\n" +
                "169plhsshseven\n" +
                "nhgsrxcdfktpbzf9vpppxzkznine9\n" +
                "xrdnlbmtdeightone3threeeighttwo\n" +
                "bnnqzcfoneeight2hhdfkrrqzt\n" +
                "342tlmjgtfcnine\n" +
                "47rvtfqlzgmjlqbqthree\n" +
                "7gnmxplrjbvfour6\n" +
                "mcgbldbhlh1eightnine\n" +
                "two9eightxnpdj61kzcdpnpnpfgsdrbcflh\n" +
                "6541fourpkdplksnkpvkjxpdnvfttlfdflz\n" +
                "kfour7\n" +
                "x4tpbnnvnjlseven\n" +
                "55nineninesevenzttsztwo9nlcqjq\n" +
                "1drhjrzsbvpl\n" +
                "mpknzhj9vmqckrpznqthreesj9\n" +
                "211zqgpdlmpn\n" +
                "4jxzrztg5onehnzvdbtcqdtsnkqtdvsd1fournine\n" +
                "bvcrcz5four4\n" +
                "4nineninecfhgtdphone9\n" +
                "zbkjgbshqqkrcb3qmtfmdrdcckcsxshjb2\n" +
                "1eightrblhbhljvkpshmrxc5\n" +
                "hjcrrdsvnbqktxrgmq9nqgcztbv\n" +
                "6lzsixl5one\n" +
                "twofivesevenfivesixonenine5seven\n" +
                "fourmldkgnzb8djlsdmjnzxbmmvpf59seven\n" +
                "8hnfkknnsrhm\n" +
                "three2krtqmmxqzs4jbrnrtrxzxsllblbkjmthcrlxxkdlh\n" +
                "mglfmvvnthreefour1\n" +
                "onehxz4fourhqcfvdlhg\n" +
                "zrzqdgs5jsttkrone\n" +
                "sevenrdmhnldsmdnineqfrgjhmhnnqkztxzm7\n" +
                "63seven\n" +
                "2seven3mrsltqb17\n" +
                "fdbtvthmmrb5gbxvcmtwosixt5five\n" +
                "eightlzglvxfone5five7dlqpmseven5\n" +
                "dmzdkbfive98onefivehhbljrnz\n" +
                "eight8ninefour\n" +
                "24nvmftwofive\n" +
                "seven3onefourrmgkxtcsfour\n" +
                "fgpxmqqsfdrk8eight8zhcrzvrzmdxbbfive\n" +
                "eightonetwo7ninesjsrlr\n" +
                "rrkrrtnkq941sixone\n" +
                "threeffspgv3eightfivesix5\n" +
                "lthnrlgfcnine2scdcvnineseven\n" +
                "sx86\n" +
                "cxklrckbz5lsqq28\n" +
                "5seven298\n" +
                "933five5cmddfj46\n" +
                "hrhhs76343\n" +
                "one3two4fourst4three\n" +
                "nine3three\n" +
                "dhtscvgm9foureight81vp\n" +
                "btpeightpzbtphdlcm8fiverknbrhthreelxndqcv\n" +
                "one96six45tm\n" +
                "fourninetkdrvnbznnine22\n" +
                "vxeightwothree5cd3jcnine\n" +
                "seven5one4one7ninefive3\n" +
                "nflkr2dlmtsrkrgkfvsixxvznjbvz3btxkhhqcc\n" +
                "eightrtz6jslqxsixoneeightnine\n" +
                "xmvxn5\n" +
                "tgnlrmjtkjdpbnpmsixbxfnl7sixone\n" +
                "htwonezcshpqgsix73qlgdqnkjskjthree\n" +
                "nrlkxq6fnfourseven\n" +
                "zmrlngjdhc41four4fourptrhddthreenhzv\n" +
                "n9twogdrzkcsbk8hph6\n" +
                "436sevens7cnkrrk\n" +
                "6qkdvkhtwo\n" +
                "mztkszm39\n" +
                "fourtwo4mqhjkkdzgffhqfktwonine\n" +
                "hbthree2hvpbznlgrxfgkthfour8\n" +
                "34prfzlx4three\n" +
                "29zzfdvghll9three6\n" +
                "two83\n" +
                "one982\n" +
                "36hhgdf7\n" +
                "seven6ninednnine9mbtzfm1\n" +
                "one38\n" +
                "seventhree5lsjxknqtdsbtxrkone\n" +
                "eightmfctkbc9jlxgdnchlq9one8nine\n" +
                "p371b\n" +
                "9ninejszqsnpkfbthree1h5xscpfzvl\n" +
                "three9ljd\n" +
                "fbbv9\n" +
                "five582\n" +
                "58dctdbhbninesixczhd\n" +
                "qp4\n" +
                "6pfqdeight\n" +
                "3onethreekqnnlt\n" +
                "m4fgbmdtwo3\n" +
                "twodkrmtqs4\n" +
                "9three6\n" +
                "six1798nineeightsqpvpsmcbmh\n" +
                "9qxxmrmbnine3fivefourfive3four\n" +
                "one7sevenone78ninetwozqps\n" +
                "973keight9seventwo\n" +
                "keightwothreethreeh6threeeightlnqdzhlt\n" +
                "five94\n" +
                "mqlltnfive8eighttwoqhztggvqqkcxgvgmch\n" +
                "2kpnsevenfive6\n" +
                "gtmszpsjmggr3\n" +
                "pm126one3\n" +
                "rvcqbtz9zjtndbxlrdcxzf3\n" +
                "mkninekhmtxzbjpd8threeeight7eight\n" +
                "5274xm636\n" +
                "bleightfive9vdddzjdntthreerxtvdslrvbcvf\n" +
                "9eight4sixdqzrltgpzlpxtcrzxbhmsmdtwothree\n" +
                "cpneightwofive3fourtwo\n" +
                "one61threejxbjvsltxzpntpv\n" +
                "19581\n" +
                "six2qllhlxhr1foursixz8\n" +
                "6278teight3three\n" +
                "8gstxqdngxzlxvnvphlsznr3kknftvzxcqqbrfteightthree\n" +
                "4jlzjvjfltwo7pv\n" +
                "7dvt\n" +
                "blhsm4xcrbrf68ninezvhhtqgphnzxlhl\n" +
                "9dvjvfourtcthree\n" +
                "onethreenfkgrvsevenkczctlgkt7\n";



        String[] splittedInput = input.split("\n");

        int sum = 0;
        for(String entry : splittedInput){
            System.out.println("result : " + trebuchetCalibrationValue(replaceMaxNums(replaceMinNums(entry))) + " Entry: " + entry);
            sum += Integer.parseInt(trebuchetCalibrationValue(replaceMaxNums(replaceMinNums(entry))));
        }
            System.out.println(sum);

    }

    private static String replaceMinNums(String entry) {

        HashMap<Integer, String> indexMap = new HashMap<>();
        indexMap.put(entry.indexOf("one"), "one");
        indexMap.put(entry.indexOf("two"), "two");
        indexMap.put(entry.indexOf("three"), "three");
        indexMap.put(entry.indexOf("four"), "four");
        indexMap.put(entry.indexOf("five"), "five");
        indexMap.put(entry.indexOf("six"), "six");
        indexMap.put(entry.indexOf("seven"), "seven");
        indexMap.put(entry.indexOf("eight"), "eight");
        indexMap.put(entry.indexOf("nine"), "nine");

        int min = 500;
        String replacedEntry = "";
        for(Integer i : indexMap.keySet()){
            if(i != -1){
                if(i < min){
                    min = i;
                }
            }
        }
        if(indexMap.get(min) != null) {
            if (indexMap.get(min).equals("one")) {
                replacedEntry = entry.replace("one", "1");
            }
            if (indexMap.get(min).equals("two")) {
                replacedEntry = entry.replace("two", "2");
            }
            if (indexMap.get(min).equals("three")) {
                replacedEntry = entry.replace("three", "3");
            }
            if (indexMap.get(min).equals("four")) {
                replacedEntry = entry.replace("four", "4");
            }
            if (indexMap.get(min).equals("five")) {
                replacedEntry = entry.replace("five", "5");
            }
            if (indexMap.get(min).equals("six")) {
                replacedEntry = entry.replace("six", "6");
            }
            if (indexMap.get(min).equals("seven")) {
                replacedEntry = entry.replace("seven", "7");
            }
            if (indexMap.get(min).equals("eight")) {
                replacedEntry = entry.replace("eight", "8");
            }
            if (indexMap.get(min).equals("nine")) {
                replacedEntry = entry.replace("nine", "9");
            }
            return replacedEntry;
        }
        else {
            return entry;
        }

//        System.out.println("OldEntry: " + entry + " Index: " + min + " Value: " + indexMap.get(min) +" NewEntry: " + replacedEntry);
    }
    private static String replaceMaxNums(String entry) {

        HashMap<Integer, String> indexMap = new HashMap<>();
        indexMap.put(entry.indexOf("one"), "one");
        indexMap.put(entry.indexOf("two"), "two");
        indexMap.put(entry.indexOf("three"), "three");
        indexMap.put(entry.indexOf("four"), "four");
        indexMap.put(entry.indexOf("five"), "five");
        indexMap.put(entry.indexOf("six"), "six");
        indexMap.put(entry.indexOf("seven"), "seven");
        indexMap.put(entry.indexOf("eight"), "eight");
        indexMap.put(entry.indexOf("nine"), "nine");

        int max = -1;
        for(Integer i : indexMap.keySet()){
            if(i != -1){
                if(i > max){
                    max = i;
                }
            }
        }
        String replacedEntry = "";
        if(indexMap.get(max) != null) {
            if (indexMap.get(max).equals("one")) {
                replacedEntry = entry.replace("one", "1");
            }
            if (indexMap.get(max).equals("two")) {
                replacedEntry = entry.replace("two", "2");
            }
            if (indexMap.get(max).equals("three")) {
                replacedEntry = entry.replace("three", "3");
            }
            if (indexMap.get(max).equals("four")) {
                replacedEntry = entry.replace("four", "4");
            }
            if (indexMap.get(max).equals("five")) {
                replacedEntry = entry.replace("five", "5");
            }
            if (indexMap.get(max).equals("six")) {
                replacedEntry = entry.replace("six", "6");
            }
            if (indexMap.get(max).equals("seven")) {
                replacedEntry = entry.replace("seven", "7");
            }
            if (indexMap.get(max).equals("eight")) {
                replacedEntry = entry.replace("eight", "8");
            }
            if (indexMap.get(max).equals("nine")) {
                replacedEntry = entry.replace("nine", "9");
            }
            return replacedEntry;
        }
        else {
            return entry;
        }

//        System.out.println("OldEntry: " + entry + " Index: " + max + " Value: " + indexMap.get(max) +" NewEntry: " + replacedEntry);
    }

    //Day 1
    public static String trebuchetCalibrationValue(String input) {
        char[] charArray = input.toCharArray();
        int firstNum = -1;
        int secondNum = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i]) && firstNum == -1) {
                firstNum = charArray[i];
            }
        }
        for (int i = charArray.length-1; i > 0; i--) {
            if (Character.isDigit(charArray[i]) && secondNum == -1) {
                secondNum = charArray[i];
            }
        }

        if(secondNum == -1){
            secondNum = firstNum;
        }

        String result1 = Integer.toString(Character.getNumericValue(firstNum));
        String result2 = Integer.toString(Character.getNumericValue(secondNum));
        return result1+result2;
    }
}












