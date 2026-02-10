/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {
      colors: {
        light: {
          background: '#FFF9F4',
          text: '#1A1A1A',
          accent: '#FFB6B9',
          secondary: '#B8E0D2',
          button: '#FF6B6B',
          hover: '#FFECEC',
        },
        dark: {
          background: '#0F172A',
          text: '#F1F5F9',
          accent: '#6366F1',
          secondary: '#94A3B8',
          button: '#7C3AED',
          hover: '#312E81',
        },
        fontFamily: {
          heading: ['Poppins', 'sans-serif'],
          body: ['Inter', 'sans-serif'],
        }
      }
    }
  },
  plugins: [],
}

