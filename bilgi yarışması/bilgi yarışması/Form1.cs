using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace bilgi_yarışması
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        int soruno = 0;
        int doğru = 0;
        int yanlış = 0;
        int süre = 20;
        private void button5_Click(object sender, EventArgs e)
        {
            timer1.Enabled = true;
            süre = 20;
            label9.Text = süre.ToString();

            soruno++;
            label1.Text = soruno.ToString();

            button1.Enabled = true;
            button2.Enabled = true;
            button3.Enabled = true;
            button4.Enabled = true;


            if (soruno == 1)
            {
                richTextBox1.Text = "Mustafa Kemal kaç yılında doğmuştur?";
                button1.Text = "1880";
                button2.Text = "1881";
                button3.Text = "1883";
                button4.Text = "1884";
                label4.Text = "1881";
            }

            if (soruno == 2)
            {
                richTextBox1.Text = "Türkiye kaç coğrafi bölgeye ayrılır?";
                button1.Text = "7";
                button2.Text = "40";
                button3.Text = "18";
                button4.Text = "20";
                label4.Text = "7";

            }

            if (soruno == 3)
            {
                richTextBox1.Text = "Türkiye'nin en büyük yüz ölçümüne sahip ili hangisidir?";
                button1.Text = "Ankara";
                button2.Text = "İstanbul";
                button3.Text = "Konya";
                button4.Text = "Bursa";
                label4.Text = "Konya";

            }

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            label3.Text = button1.Text;
            button1.Enabled = false;
            button2.Enabled = false;
            button3.Enabled = false;
            button4.Enabled = false;
            if (label3.Text == label4.Text)
            {
                doğru++;
                label6.Text = doğru.ToString();
            }

            else
            {
                yanlış++;
                label7.Text = yanlış.ToString();
            }

            timer1.Enabled = false;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            label3.Text = button2.Text;
            button1.Enabled = false;
            button2.Enabled = false;
            button3.Enabled = false;
            button4.Enabled = false;
            if (label3.Text == label4.Text)
            {
                doğru++;
                label6.Text = doğru.ToString();
            }

            else
            {
                yanlış++;
                label7.Text = yanlış.ToString();
            }
            timer1.Enabled = false;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            label3.Text = button3.Text;
            button1.Enabled = false;
            button2.Enabled = false;
            button3.Enabled = false;
            button4.Enabled = false;
            if (label3.Text == label4.Text)
            {
                doğru++;
                label6.Text = doğru.ToString();
            }

            else
            {
                yanlış++;
                label7.Text = yanlış.ToString();
            }

            timer1.Enabled = false;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            label3.Text = button4.Text;
            button1.Enabled = false;
            button2.Enabled = false;
            button3.Enabled = false;
            button4.Enabled = false;
            if (label3.Text == label4.Text)
            {
                doğru++;
                label6.Text = doğru.ToString();
            }

            else
            {
                yanlış++;
                label7.Text = yanlış.ToString();
            }
            timer1.Enabled = false;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            süre = Convert.ToInt32(label9.Text);
            süre = süre - 1;
            label9.Text = süre.ToString();

            if (süre == 0)
            {
                timer1.Enabled = false;
                yanlış++;
                label7.Text = yanlış.ToString();
            }
        }
    }
}
