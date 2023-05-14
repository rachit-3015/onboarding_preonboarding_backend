package com.project.config;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig /* extends WebSecurityConfigurerAdapter */{
	/*
	 * 
	 * @Autowired private JwtAuthenticationFilter jwtAuthenticationFilter;
	 * 
	 * @Autowired private UserDetailsServiceImpl userDetailsServiceImpl;
	 * 
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.userDetailsService(userDetailsServiceImpl); }
	 * 
	 * @Bean
	 * 
	 * @Override public AuthenticationManager authenticationManagerBean() throws
	 * Exception { return super.authenticationManagerBean(); }
	 * 
	 * @Bean public PasswordEncoder passwordEncoder() { return
	 * NoOpPasswordEncoder.getInstance(); }
	 * 
	 * @Bean public CorsConfigurationSource corsConfigurationSource() {
	 * CorsConfiguration configuration = new CorsConfiguration();
	 * configuration.setExposedHeaders(Arrays.asList(
	 * "Content-Type,,filename,Content-disposition"));
	 * configuration.setAllowedOrigins(Arrays.asList("*"));
	 * configuration.setAllowedMethods(Arrays.asList("*"));
	 * configuration.setAllowedHeaders(Arrays.asList("*"));
	 * configuration.setAllowCredentials(true); final
	 * UrlBasedCorsConfigurationSource source = new
	 * UrlBasedCorsConfigurationSource(); source.registerCorsConfiguration("/**",
	 * configuration); return source; }
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception { http
	 * .authorizeRequests() .antMatchers("/") .permitAll() .antMatchers("/*","/**")
	 * .permitAll() .anyRequest() .authenticated() .and() .sessionManagement()
	 * .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	 * http.addFilterBefore(this.jwtAuthenticationFilter
	 * ,UsernamePasswordAuthenticationFilter.class);
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 */}
