using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace at_yarışı
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        int birinciatsolauzaklık, ikinciatsolauzaklık, üçüncüatsolauzaklık;

        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Enabled = true;
            
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            int derece = Convert.ToInt32(label7.Text);
            derece++;
            label7.Text = derece.ToString();

            int birinciatgenişliği = pictureBox1.Width;
            int ikinciatgenişliği = pictureBox2.Width;
            int üçüncüatgenişliği = pictureBox3.Width;

            int bitişuzaklığı = label5.Left;

            pictureBox1.Left = pictureBox1.Left + rastgele.Next(5, 15);
            pictureBox2.Left = pictureBox2.Left + rastgele.Next(5, 15);
            pictureBox3.Left = pictureBox3.Left + rastgele.Next(5, 15);

            if (pictureBox1.Left > pictureBox2.Left + 5 && pictureBox1.Left > pictureBox3.Left + 5)
            {
                label6.Text = "1 numaralı at yarışı önde götürüyor";

            }

            if (pictureBox2.Left > pictureBox1.Left + 5 && pictureBox2.Left > pictureBox3.Left + 5)
            {
                label6.Text = "2 numaralı at iyi bir atakla önde";

            }

            if (pictureBox3.Left > pictureBox1.Left + 5 && pictureBox3.Left > pictureBox2.Left + 5)
            {
                label6.Text = "3 numaralı at liderliği ele geçirdi";

            }

            if (birinciatgenişliği + pictureBox1.Left >= bitişuzaklığı)
            {
                timer1.Enabled = false;
                label6.Text="***1 numaralı at yarışı kazandı***";
                
            }

            if (ikinciatgenişliği + pictureBox2.Left >= bitişuzaklığı)
            {
                timer1.Enabled = false;
                label6.Text = "***2. at yarışı kazandı***";
            }

            if (üçüncüatgenişliği + pictureBox3.Left >= bitişuzaklığı)
            {
                timer1.Enabled = false;
                label6.Text="***3. at yarışı kazandı***";

            }

           
        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        Random rastgele = new Random();

        private void Form1_Load(object sender, EventArgs e)
        {
            birinciatsolauzaklık = pictureBox1.Left;
            ikinciatsolauzaklık = pictureBox2.Left;
            üçüncüatsolauzaklık = pictureBox3.Left;

           /* pictureBox1.Left = 3;
            pictureBox2.Left = 3;
            pictureBox3.Left = 3;
            int süre = 0;
            label7.Text = süre.ToString();*/
        }
    }
}
